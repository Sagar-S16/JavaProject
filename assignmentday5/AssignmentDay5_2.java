package assignmentday5;


interface Vehicle1 {
 void start();
 void stop();
}

class Car6 implements Vehicle1 {
 @Override
 public void start() {
     System.out.println("Car is started");
 }

 @Override
 public void stop() {
     System.out.println("Car is stopping");
 }
}

class Bike implements Vehicle1 {
 @Override
 public void start() {
     System.out.println("Bike is starting");
 }

 @Override
 public void stop() {
     System.out.println("Bike is stopping");
 }
}

public class AssignmentDay5_2 {
    public static void main(String[] args) {
        Vehicle1 car = new Car6();
        Vehicle1 bike = new Bike();

        car.start();
        car.stop();

        bike.start();
        bike.stop();
    }
}

