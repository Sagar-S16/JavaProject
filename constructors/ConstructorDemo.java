package constructors;



public class ConstructorDemo {

	  //Instance variables
	  String name;
	  int age;

	  // Default constructor
	  ConstructorDemo() {
	      name = "Unknown";
	      age = 0;
	  }

	  // Parameterized constructor
	  ConstructorDemo(String name, int age) {
	      this.name = name;
	      this.age = age;
	  }

	  // Method to display values
	  void display() {
	      System.out.println("Name: " + name + ", Age: " + age);
	  }

	  public static void main(String[] args) {
	      // Creating object using default constructor
	      ConstructorDemo obj1 = new ConstructorDemo();
	      obj1.display();

	      // Creating object using parameterized constructor
	      ConstructorDemo obj2 = new ConstructorDemo("Sagar", 25);
	      obj2.display();
	  }
	}
