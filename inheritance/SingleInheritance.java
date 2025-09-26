package inheritance;

class Animal1{
	void bark() {
		System.out.println("Animal is Barking");
	}
}

class Dog extends Animal1{
	void eat() {
		System.out.println("Animal is Eating");
	}
	
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog a = new Dog();
		a.bark();
		a.eat();
		
	}

}
