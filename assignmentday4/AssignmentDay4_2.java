package assignmentday4;


class Animal5 {
    void sound() {
        System.out.println("Animals bark");
    }
}

class Dog3 extends Animal5 {
   
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat3 extends Animal5 {
    
    void sound() {
        System.out.println("Cat meows");
    }
}

public class AssignmentDay4_2 {
    public static void main(String[] args) {
        Animal5 a = new Animal5();
        Dog3 d = new Dog3();
        Cat3 c = new Cat3();

        a.sound();  
        d.sound();  
        c.sound(); 
    }
}

