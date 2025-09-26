package assignmentday3;

class Laptop {
    // Instance variables
    String brand;
    int ramSize;
    double price;

    // Static variable
    static String category = "Electronics";

    // Default constructor
    public Laptop() {
        this.brand = "Unknown";
        this.ramSize = 4;
        this.price = 30000.0;
    }

    // Overloaded constructor 1
    public Laptop(String brand) {
        this.brand = brand;
        this.ramSize = 8;
        this.price = 45000.0;
    }

    // Overloaded constructor 2
    public Laptop(String brand, int ramSize, double price) {
        this.brand = brand;
        this.ramSize = ramSize;
        this.price = price;
    }

    // Non-static method
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM Size: " + ramSize + "GB");
        System.out.println("Price: ₹" + price);
    }

    // Static method
    public static void showCategory() {
        System.out.println("Category: " + category);
    }
}
	class AssignmentDay3_2{
   
       public static void main(String[] args) {
        
        Laptop.showCategory();

        
        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop("Dell");
        Laptop laptop3 = new Laptop("HP", 16, 75000.0);

       
        System.out.println("\nLaptop 1 Details:");
        laptop1.displayDetails();

        System.out.println("\nLaptop 2 Details:");
        laptop2.displayDetails();

        System.out.println("\nLaptop 3 Details:");
        laptop3.displayDetails();
    }
}

