package polymorphism;

class Animal3 {
	void sound() {
		System.out.println("Animal makes sound");
	}
}
	class Dog1 extends Animal3{
		void sound() {
			System.out.println("Dog Barks");
		}
	}
	class Cat extends Animal3{
		void sound(){
				System.out.println("Cat meows");
			}
		}
	

public class Run_time_polymorphism {

	public static void main(String[] args) {
		
		Animal3  a =  new Dog1();
		a.sound();
		Animal3  b = new Cat();
		b.sound();

	}

}

