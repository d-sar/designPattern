package com.enset.repo;

import com.enset.model.AccountStatus;
import com.enset.model.AccountType;
import com.enset.model.BankAccount;
import com.enset.model.BankDirector;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public class AccountRepositoryImp implements AccountRepository {
    //singleton pour conciste a declarer une vriable static de la meme classe de la classe qui vous coullez instancier comme un singleton  et inisialiser cette variable dans le bloc static (au mement de chargement de la class en memoire)
    // et defenire une methode static qui permet de retourner cette instance + la synchronization
    // private static  AccountRepositoryImp instance;
    private static final AccountRepositoryImp instance;

    static {
        System.out.println("instanciation du singleton ");
        instance = new AccountRepositoryImp();
    }

    // constructure private
   private AccountRepositoryImp() {

   }
    private Map<Long, BankAccount> bankAccounts = new HashMap<>();


    private long accountsCount = 0;
    @Override
    public BankAccount save(BankAccount bankAccount) {
        Long accountId;
        synchronized (this) {
            accountId = accountsCount++;// critical zone
        }
        bankAccount.setAccountId(accountId);
        synchronized (this) {
            bankAccounts.put(accountId, bankAccount);
        }
        return bankAccount;
    }

    @Override
    public List<BankAccount> findAll() {
        return bankAccounts.values().stream().toList();
    }

    @Override
    public Optional<BankAccount> findById(Long id) {
        BankAccount account = bankAccounts.get(id);
        if(account == null) return Optional.empty();
        else return Optional.of(account);

    }

    @Override
    public List<BankAccount> searchAccounts(Predicate<BankAccount> predicate) {

        return bankAccounts.values().stream().filter(predicate).toList();
    }

    @Override
    public BankAccount update(BankAccount account) {
        bankAccounts.put(account.getAccountId(), account);
        return account;
    }

    @Override
    public void deleteById(Long id) {
            bankAccounts.remove(id);
    }
    public  void populateData(){
        for(int i = 0; i < 10; i++){
            BankAccount account = BankDirector.accountBuilder()
                    .type(Math.random()>0.5?AccountType.SAVING_ACCOUNT:AccountType.CURRENT_ACCOUNT)
                    .status(Math.random()>0.5?AccountStatus.CRETED:AccountStatus.ACTIVATED)
                    .currency(Math.random()>0.5?"USD":"EUR")
                    .balance(1000+Math.random()*9000)
                    .build();
            save(account);
        }
        System.out.println("*********");
        System.out.println(Thread.currentThread().getName());
        System.out.println("Account Count = "+ accountsCount);
        System.out.println("Size = "+bankAccounts.values().size());
        System.out.println("*********");
    }
    public synchronized static AccountRepositoryImp getInstance() {
//        if(instance == null) {
//            System.out.println("instanciation de Singleton ");
//            instance= new AccountRepositoryImp();
//            instance.populateData();
//        }
        return instance;
    }
}
