package assignmentday4;
public class AssignmentDay4_3 {


    public int add(int a, int b) {
        return a + b;
    }

   
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        AssignmentDay4_3 calc = new AssignmentDay4_3();

        System.out.println("Add 2 integers: " + calc.add(5, 10));
        System.out.println("Add 3 integers: " + calc.add(1, 2, 3));
        System.out.println("Add 2 doubles: " + calc.add(2.5, 3.7));
    }
}
