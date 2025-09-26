package assignmentday3;
class Calculator{

	   
    public static int staticAdd(int a, int b) {
        return a + b;
    }

    
    public static int staticMultiply(int a, int b) {
        return a * b;
    }

    // Non-static method for addition
    public int nonStaticAdd(int a, int b) {
        return a + b;
    }

    // Non-static method for multiplication
    public int nonStaticMultiply(int a, int b) {
        return a * b;
    }
}
 public class AssignmentDay3_1 {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Calling static methods
        int sumStatic = Calculator.staticAdd(a, b);
        int productStatic = Calculator.staticMultiply(a, b);
        System.out.println("Static Addition: " + sumStatic);
        System.out.println("Static Multiplication: " + productStatic);

        
        Calculator calc = new Calculator();
        int sumNonStatic = calc.nonStaticAdd(a, b);
        int productNonStatic = calc.nonStaticMultiply(a, b);
        System.out.println("Non-Static Addition: " + sumNonStatic);
        System.out.println("Non-Static Multiplication: " + productNonStatic);
    }
 }
