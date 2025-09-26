package constructors;



class Student{
	Student(){
		String school = "MCE";
		System.out.println(school);
	}
	Student(String name, int age){
		String name1 = name;
		int age2 = age;
		System.out.println(name1);
		System.out.println(age2);
	}
}

public class Constructor {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student("Sagar", 25);
	}

}
