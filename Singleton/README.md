

### **1. Singleton**

**Objectif :** Garantir qu’une classe n’ait qu’une seule instance et fournir un point d’accès global à cette instance.
**Utilité :** Gestion de ressources partagées, configuration globale, connexion à une base de données.

**Exemple Java :**

```java
public class AccountRepositoryImp implements AccountRepository  {
    private static final AccountRepositoryImp instance;
    
    static {
        System.out.println("instanciation du singleton ");
        instance = new AccountRepositoryImp();
    }
    
    // constructure private
    private AccountRepositoryImp() {
    }
    
    public synchronized static AccountRepositoryImp getInstance() {
        return instance;
    }
}
```
### **2. Builder**

**Objectif :** Séparer la construction d’un objet complexe de sa représentation afin de pouvoir créer différents types et représentations de cet objet.
**Utilité :** Création d’objets avec beaucoup d’attributs optionnels, lisibilité améliorée.

**Exemple Java :**

```java
public class BankAccount {
    private Long accountId;
    private double balance;
    private String currency;
    private AccountType type;
    private AccountStatus status;
    
    public static class AccountBuilder{
        private BankAccount bankAccount =  new BankAccount();

        public AccountBuilder accountId(Long id) {
            bankAccount.accountId = id;
            return this;
        }

        public AccountBuilder currency(String currency) {
            bankAccount.currency = currency;
            return this;
        }
        public AccountBuilder balance(double balance) {
            bankAccount.balance = balance;
            return this;
        }
        public AccountBuilder type(AccountType type) {
            bankAccount.type = type;
            return this;
        }
        public AccountBuilder status(AccountStatus status) {
            bankAccount.status = status;
            return this;
        }
        public BankAccount build() {
            return this.bankAccount;
        }

    }
}

// Utilisation
        BankAccount account= BankDirector.accountBuilder()
                .accountId(1L)
                .type(AccountType.CURRENT_ACCOUNT)
                .status(AccountStatus.ACTIVATED)
                .currency("MAD")
                .balance(70000)
                .build();
        System.out.println(account.toString());
```

---

### **3. Prototype**

**Objectif :** Créer de nouveaux objets en copiant un objet existant plutôt qu’en le construisant depuis zéro.
**Utilité :** Réduire le coût de création d’objets complexes, permettre le clonage d’objets configurés.

**Exemple Java :**

```java
public class BankAccount implements Cloneable {
    private Long accountId;

    public Shape(Long accountId) { this.accountId = accountId; }

    @Override
    public BankAccount clone() throws CloneNotSupportedException {
        return (BankAccount) super.clone();
    }

    @Override
    public String toString() {
        return  "accountId='" + accountId + '\'' + '}';
    }
}

// Utilisation

BankAccount account3 = account1.clone();
System.out.println("ACC3 = "+account3);
```

---

**Résumé rapide :**

| Pattern   | But principal                              | Exemple d’utilisation                |
| --------- | ------------------------------------------ | ------------------------------------ |
| Singleton | Une seule instance globale                 | Connexion DB, Logger                 |
| Builder   | Créer des objets complexes étape par étape | Construction d’un objet avec options |
| Prototype | Cloner des objets existants                | Duplication d’objets configurés      |

