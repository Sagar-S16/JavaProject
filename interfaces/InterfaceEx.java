package interfaces;



interface Drivable{
	static int a = 30;
	String name = "Sagar S";
	void start();
	void drive();
	void stop();
}
class Carr implements Drivable{
	@Override
	public void start() {
		System.out.println("Car is Starting");
	}
	@Override
	public void drive() {
		System.out.println("Car is driving");
	}
	@Override
	public void stop() {
		System.out.println("Car has stopped");
		System.out.println(a);
		System.out.println(name);
	}
}
public class InterfaceEx {

	public static void main(String[] args) {
		Drivable myCar = new Carr();
		myCar.start();
		myCar.drive();
		myCar.stop();

	}

}
