package assignmentday3;

class Circle {
    // Instance variable
    double radius;

    // Default constructor
    public Circle() {
        this.radius = 1.0; // default radius
    }

    // Overloaded constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
    
  class AssignmentDay3_3{
    public static void main(String[] args) {
        // Using default constructor
        Circle circle1 = new Circle();
        System.out.println("Area of circle1 (default radius): " + circle1.calculateArea());

        // Using overloaded constructor
        Circle circle2 = new Circle(5.5);
        System.out.println("Area of circle2 (radius 5.5): " + circle2.calculateArea());
    }
}