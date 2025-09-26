package oops;



class VariableScopeDemo{
	//Instance variables
	String studentName;
	//static variables
	static String collegeName = "ABC College";
	//Constructor to initialize objects
	  VariableScopeDemo(String name){
	  studentName = name;
	}
	//Method demonstrating to local variable and block scope
	void showDetails() {
		int year = 2025; //local variable
	
		System.out.println(studentName);
		System.out.println(collegeName);
		System.out.println(year);
		
		//Block scope
		if(year>2024) {
			int semester = 7;//Block scope variables
			System.out.println(semester);
		}
		//System.out.println(semester);//not accessible here
		
	}
		public static void main(String[] args) {
		
		//creating objects with different instance variables
		VariableScopeDemo s1 =  new VariableScopeDemo("Alice");
		//	s1.studentName = "Alice";
		 VariableScopeDemo s2 = new VariableScopeDemo("Bob");
		 
		 s1.showDetails();
		 s2.showDetails();
		 
		 //After changing the static variable affect all objects
		 VariableScopeDemo.collegeName = "xyz";
		 s1.showDetails();
		 s2.showDetails();
	}
}