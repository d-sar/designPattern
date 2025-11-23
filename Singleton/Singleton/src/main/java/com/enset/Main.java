package com.enset;

import com.enset.model.AccountStatus;
import com.enset.model.AccountType;
import com.enset.model.BankAccount;
import com.enset.model.BankDirector;
import com.enset.repo.AccountRepositoryImp;

import java.io.IOException;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws IOException {

        // sans singleton
        // AccountRepositoryImp accountRepo = new AccountRepositoryImp();

        // l'utilisation de singleton
        AccountRepositoryImp accountRepo = AccountRepositoryImp.getInstance();

        //thread probleme de synchronisation : solution attendre de virouiller
        for(int i= 0;i<10;i++){
            new Thread(()->{
                accountRepo.populateData();
            }).start();
        }
        System.out.print("taper une touche ");

        System.in.read();

        //accountRepo.populateData();
        System.out.println("-------------------");
        accountRepo.findAll().forEach(System.out::println);
//
//        System.out.println("-------------------");
//        accountRepo.findById(1L).ifPresent(System.out::println);
//        System.out.println("-------------------");
//       List<BankAccount> bankAccounts= accountRepo.searchAccounts(new Predicate<BankAccount>() {
//            @Override
//            public boolean test(BankAccount bankAccount) {
//                return bankAccount.getType().equals(AccountType.CURRENT_ACCOUNT);
//            }
//        });
//       for (BankAccount bankAccount : bankAccounts) {
//           System.out.println(bankAccount);
//       }





//        BankAccount account1 = new BankAccount();
//        account1.setAccountId(1L);
//        account1.setBalance(10000);
//        account1.setCurrency("MAD");
//        account1.setType(AccountType.CURRENT_ACCOUNT);
//        account1.setStatus(AccountStatus.ACTIVATED);
//        System.out.println(account1.toString());
//
//        BankAccount account2 = new BankAccount(
//                2L,
//                50000,
//                "USD",
//                AccountType.SAVING_ACCOUNT,
//                AccountStatus.ACTIVATED
//        );
//        System.out.println(account2.toString());
//
//        BankAccount account= BankDirector.accountBuilder()
//                .accountId(1L)
//                .type(AccountType.CURRENT_ACCOUNT)
//                .status(AccountStatus.ACTIVATED)
//                .currency("MAD")
//                .balance(70000)
//                .build();
//        System.out.println(account.toString());
//


    }
}