package interfaces;

class Account {
    private String accountHolder;
    private double balance;  //Encapsulation

    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() { // getters and we are setting value by passing values from the constructor and getting the values from the getters
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {  //Creating a method for depositing 
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    public void withdraw(double amount) {  // create a method for withdrawing balance
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}


abstract class BankService {  // abstract class
    public abstract void provideService(Account account); // abstract method because same bank providing different services to same accountHolder

    public void printWelcomeMessage() { // concrete method because it is a common 
        System.out.println("Welcome to our Bank!");
    }
}


class LoanService extends BankService {
    @Override
    public void provideService(Account account) { // by extending we can able to overrriding the abstract method
        System.out.println("Loan service provided for " + account.getAccountHolder());
    }
}

class InsuranceService extends BankService { 
    @Override
    public void provideService(Account account) { // Account is a class and account is a variable name
        System.out.println("Insurance service provided for " + account.getAccountHolder());
    }
}


class Transaction {
    public void transfer(Account from, Account to, double amount) { // method overloading (polymorphism)
        from.withdraw(amount);
        to.deposit(amount);
    }

    public void transfer(Account to, double amount) {
        System.out.println("Cash deposit into " + to.getAccountHolder() + "'s account.");
        to.deposit(amount);
    }
}


public class BankingSystem {
    public static void main(String[] args) {
      
        Account acc1 = new Account("Alice", 5000); // creating 2 objects by sending values 
        Account acc2 = new Account("Bob", 3000);

      
        System.out.println(acc1.getAccountHolder() + "'s balance: " + acc1.getBalance());

       
        BankService service;
        service = new LoanService();
        service.printWelcomeMessage();
        service.provideService(acc1);

        service = new InsuranceService();
        service.provideService(acc2);

        Transaction txn = new Transaction();//method overloading objects
        txn.transfer(acc1, acc2, 2000); // transfer between accounts
        txn.transfer(acc2, 1500); // deposit into account
    }
}