package encapsulation;

class ATM {
    private double balance;

    //Constructor
//    public ATM(double initialBalance) {
//        this.balance = initialBalance;
//    }

    //getters
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double initialbalance) {
    	this.balance = initialbalance;
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            processWithdrawal(amount);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    // Private method to process withdrawal
    private void processWithdrawal(double amount) { // we can access in another method in the same class
        balance -= amount;
        System.out.println(amount + " withdrawn successfully");
    }
}

public class MethodExampleEncapsul {

    public static void main(String[] args) {
    	
        ATM myAtm = new ATM();
        myAtm.withdraw(10000);       
        myAtm.setBalance(20000);
           

        System.out.println("Current Balance: " + myAtm.getBalance());
    }
}
