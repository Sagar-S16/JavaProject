package inheritance;

class Car2{
	void sing() {
		System.out.println("We can listen music in car");
	}
}
class Mustang extends Car2{
	void drive() {
		System.out.println("Car is Driving");
	}
}

class Bmw extends Car2{
	void drift() {
		System.out.println("We can drift in car");
	}
}
public class HierarchialLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mustang m = new Mustang();
		Bmw b = new Bmw();
		m.sing();
		m.drive();
		b.drift();
		b.sing();

	}

}
