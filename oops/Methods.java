package oops;

class Calculator1{
	   
    public static int staticAdd(int a, int b) {
        return a + b;
    }

    
    public static int staticMultiply(int a, int b) {
        return a * b;
    }

    
    public int nonStaticAdd(int a, int b) {
        return a + b;
    }

    
    public int nonStaticMultiply(int a, int b) {
        return a * b;
    }
}


 public class Methods {
    public static void main(String[] args) {
        int a = 10, b = 5;
        
        int sumStatic = Calculator1.staticAdd(a, b);
        int productStatic = Calculator1.staticMultiply(a, b);
        System.out.println("Static Add: " + sumStatic);
        System.out.println("Static Mul: " + productStatic);

        
        Calculator1 calc = new Calculator1();
        int sumNonStatic = calc.nonStaticAdd(a, b);
        int productNonStatic = calc.nonStaticMultiply(a, b);
        System.out.println("Non-Static Add: " + sumNonStatic);
        System.out.println("Non-Static Mul: " + productNonStatic);
    }
 }
