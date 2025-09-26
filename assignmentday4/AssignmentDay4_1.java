package assignmentday4;
class Person1 {
	   
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
        if (age > 0) { 
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}


public class AssignmentDay4_1 {
    public static void main(String[] args) {
        Person1 p = new Person1();

       
        p.setName("Sagar S");
        p.setAge(25);

        
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}

