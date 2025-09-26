package abstraction;

abstract class Vehicle {
    
    abstract void move();

   
    void start() {
        System.out.println("Vehicle is starting");
    }
}


class Bicycle extends Vehicle {
    @Override
    void move() {
        System.out.println("Bicycle pedals forward");
    }

    void stop() {
        System.out.println("Bicycle stopped");
    }
}


class Car5 extends Vehicle {
    
    void move() {
        System.out.println("Car drives forward");
    }

    void stop() {
        System.out.println("Car stopped");
    }
}


public class Abstraction {
    public static void main(String[] args) {
    
        Vehicle v1 = new Bicycle();
        v1.start();
        v1.move();
       
       //((Bicycle) v1).stop();

        System.out.println();

        Vehicle v2 = new Car5();
        v2.start();
        v2.move();
        //((Car5) v2).stop();
    }
}
