package oops;

class Animal{
	int legs = 4;
	String colour = "Red";
	void cat() {
			System.out.println("I'd like to eat non veg");
	}
}

public class Oops_Example {
	public static void main(String[] args) {
		Animal cat = new Animal();
		System.out.println(cat.legs);
		System.out.println(cat.colour);
		
	}
}
