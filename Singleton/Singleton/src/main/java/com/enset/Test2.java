package com.enset;

import com.enset.model.AccountStatus;
import com.enset.model.AccountType;
import com.enset.model.BankAccount;

public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        BankAccount account1 = new BankAccount();
        account1.setAccountId(1L);
        account1.setBalance(10000);
        account1.setCurrency("MAD");
        account1.setType(AccountType.CURRENT_ACCOUNT);
        account1.setStatus(AccountStatus.ACTIVATED);

        BankAccount account2 = new BankAccount();
        account2.setAccountId(account1.getAccountId());
        account2.setBalance(account1.getBalance());
        account2.setCurrency(account1.getCurrency());
        account2.setType(account1.getType());
        account2.setStatus(account1.getStatus());
        // patternn Prototype
        BankAccount account3 = account1.clone();

        BankAccount account4 = account1;

        System.out.println("ACC1 = "+account1);
        System.out.println("ACC2 = "+account2);
        System.out.println("ACC3 = "+account3);
        System.out.println("ACC4 = "+account4);
        System.out.println("=========== ");
        account1.setAccountId(2L);
        account2.setAccountId(account1.getAccountId());
        account3.setAccountId(account3.getAccountId());
        account4.setAccountId(account4.getAccountId());
        System.out.println("ACC1 = "+account1);
        System.out.println("ACC3 = "+account3);
        System.out.println("ACC4 = "+account4);

    }

}
