package inheritance;

class Payment{
	void pay(double amount) {
		System.out.println("generic amount");
	}
}

class CreditCard extends Payment{
	void pay(double amount) {
		System.out.println(amount  +    " - using credit card");
	}
}

class UPI extends Payment{
	void pay(double amount) {
		System.out.println(amount  +     " - Using UPI");
	}
}
public class PaymentExample {

	public static void main(String[] args) {
		
		Payment payment;
		payment = new CreditCard();
		payment.pay(100);
		payment = new UPI();
		payment.pay(100);
	}

}