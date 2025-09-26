package polymorphism;



class Calculator3{
	int add (int a , int b) {
		return a+b;
	}
	double add(double a , double b) {
		return a + b;
	}
	String add(String a , String b) {
		return a + b;
	}
	
}
public class Compile_time_Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator3 c = new Calculator3();
			System.out.println(c.add(5, 10));
			System.out.println(c.add(5.0,10.0));
			System.out.println(c.add("A", "B"));

	}

}
// method signature is same but implementation is differ thats why we use overriding 
