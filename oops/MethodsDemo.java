package oops;


public class MethodsDemo {

    // Instance variable
    int instanceVar = 10;

    // Static variable
    static int staticVar = 20;

    // Static method
    static void staticMethod() {
        System.out.println("Inside static method");
        System.out.println("Static variable: " + staticVar);

        // You cannot access instance variables directly in a static method
        // System.out.println("Instance variable: " + instanceVar); // This would cause an error
    }

    // Instance method
    void instanceMethod() {
        // Local variable
        int localVar = 30;

        System.out.println("Inside instance method");
        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Static variable: " + staticVar);
        System.out.println("Local variable: " + localVar);
    }

    public static void main(String[] args) {
        // Calling static method
        staticMethod();

        // Creating object to call instance method
        MethodsDemo obj = new MethodsDemo();
        obj.instanceMethod();
    }
}




//public class ConstructorDemo {
//
//    // Instance variables
//    String name;
//    int age;
//
//    // Default constructor
//    ConstructorDemo() {
//        name = "Unknown";
//        age = 0;
//    }
//
//    // Parameterized constructor
//    ConstructorDemo(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    // Method to display values
//    void display() {
//        System.out.println("Name: " + name + ", Age: " + age);
//    }
//
//    public static void main(String[] args) {
//        // Creating object using default constructor
//        ConstructorDemo obj1 = new ConstructorDemo();
//        obj1.display();
//
//        // Creating object using parameterized constructor
//        ConstructorDemo obj2 = new ConstructorDemo("Sagar", 25);
//        obj2.display();
//    }
//}


