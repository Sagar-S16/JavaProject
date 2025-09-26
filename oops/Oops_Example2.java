package oops;

class Phone{
	String PhoneName= "Samsung";
	
	void talk() {
		System.out.println("I am talking in phone");
		System.out.println(PhoneName);
	}
	void watch() {
			System.out.println("I am watching a movie");
	}
	void game() {
		System.out.println("I am playing a game in the mobile");
	}
}

public class Oops_Example2 {
	public static void main (String[] args) {
		Phone m =  new Phone();
			m.talk();
			m.watch();
			m.game();
		}
	}