package assignmentday3;


class Car1 {
	   // Instance variables
	    String brand;
	    String model;
	    int year;

	    // Default constructor
	    public Car1() {
	        this.brand = "Unknown";
	        this.model = "Unknown";
	        this.year = 2000;
	    }

	    // Parameterized constructor
	    public Car1(String brand, String model, int year) {
	        this.brand = brand;
	        this.model = model;
	        this.year = year;
	    }

	    // Method to display car details
	    public void displayDetails() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Model: " + model);
	        System.out.println("Year: " + year);
	    }
	}
			class AssignmentDay3_5{
	   
	           public static void main(String[] args) {
	   
	        Car1 car1 = new Car1();

	       // Using parameterized constructor
	        Car1 car2 = new Car1("Toyota", "Fortuner", 2022);

	       
	        System.out.println("Car 1 Details:");
	        car1.displayDetails();

	        System.out.println("\nCar 2 Details:");
	        car2.displayDetails();
	    }
	}
