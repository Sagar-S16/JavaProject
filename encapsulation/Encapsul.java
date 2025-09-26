package encapsulation;

class Student2{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}
public class Encapsul {
	public static void main(String[] args) {
		Student2 s = new Student2();
		s.setName("Sagar S");
		s.setAge(25);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		

	}

}