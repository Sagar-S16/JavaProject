package assignmentday4;


abstract class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public abstract void withdraw(double amount);
    public abstract double calculateInterest();

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate / 100;
    }
}


class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= (balance + overdraftLimit)) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Exceeded overdraft limit or invalid amount.");
        }
    }

    @Override
    public double calculateInterest() {
        return 0.0; // No interest for current accounts
    }
}

public class AssignmentDay4 {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SA123", "Alice", 1000.0, 5.0);
        BankAccount current = new CurrentAccount("CA456", "Bob", 500.0, 300.0);

        System.out.println("=== Savings Account ===");
        savings.displayAccountInfo();
        savings.deposit(200);
        savings.withdraw(100);
        System.out.println("Interest: " + savings.calculateInterest());

        System.out.println("\n=== Current Account ===");
        current.displayAccountInfo();
        current.deposit(300);
        current.withdraw(700); // within overdraft
        System.out.println("Interest: " + current.calculateInterest());
    }
}


