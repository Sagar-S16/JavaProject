package oops;

//class Bank {
//int balance;
//
//Bank(int initialBalance) {
//  balance = initialBalance;
//}
//
//void deposit(int amount) {
//  balance += amount;
//  System.out.println(amount);
//}
//
//void withdraw(int amount) {
//  if (amount <= balance) {
//      balance -= amount;
//      System.out.println(amount);
//  } else {
//      System.out.println("Insufficient balance.");
//  }
//}
//
//int getBalance() {
//  return balance;
//}
//}
//
//public class Oops_Example3 {
//public static void main(String[] args) {
//  Bank account = new Bank(5000);
//
//  account.deposit(2000);
//  account.withdraw(1000);
//
//  System.out.println(account.getBalance());
//}
//}




class Bank {
int balance;

void deposit(int amount) {
  balance += amount;
  System.out.println(amount);
}


void withdraw(int amount) {
  if (amount <= balance) {
      balance -= amount;
      System.out.println(amount);
  } else {

      System.out.println("Insufficient balance.");
  }
}
}

public class Oops_Example3 {
public static void main(String[] args) {
  Bank account = new Bank();
  account.balance = 5000; 
  account.deposit(2000);
  account.withdraw(1000);

  System.out.println(account.balance);
}
}
