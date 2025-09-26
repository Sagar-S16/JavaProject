package oops;

class Car{
	String brand ;
	int year;
		void display() {
			System.out.println("brand : " + brand + " year : " + year);
		}
}
	
	class Bag{
		int pen = 5;
		int laptop = 1;
		void Store() {
			System.out.println("Books,Pen,Laptop");
		}
		void books() {
			System.out.println("Java Books");
		}
		void thing() {
			System.out.println("Syrup");
		}
	}

	
public class Oops_part1 {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.brand = "Toyata";
		myCar.year = 2021;
		myCar.display();
		
		Bag bag = new Bag();//nandhini
		bag.Store();
		int pen1 = bag.pen;
		int lap = bag.laptop;
		System.out.println(pen1 + lap);
		Bag sagar = new Bag(); // Sagar
		sagar.books();
		Bag vivek = new Bag();//Vivek
		vivek.thing();
	}
}