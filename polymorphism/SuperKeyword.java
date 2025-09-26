package polymorphism;
class Employee{
	String name;
	int salary;
	
	Employee(String name,int salary){
		this.name = name;
		this.salary = salary;
	}
	void displayInfo() {
		System.out.println(name);
		System.out.println(salary);
	}
	
}

   class Manager extends Employee{
	String department;
	
	Manager(String name, int salary,String department){
		super(name,salary);
		this.department = department;
	}
	//Overriding method
	@Override
	void displayInfo() {
		super.displayInfo();
		System.out.println(department);
	}
}
   public class SuperKeyword {
	   	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager m = new Manager("Sagar",37000,"IT");
		m.displayInfo();
		
		
		
		
		}

	}
