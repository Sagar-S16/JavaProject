package assignmentday5;

abstract class Appliance {
 abstract void turnOn();
 abstract void turnOff();
}
class Fan extends Appliance {
 @Override
 void turnOn() {
     System.out.println("Fan is now spinning.");
 }

 @Override
 void turnOff() {
     System.out.println("Fan has stopped.");
 }
}

class Light extends Appliance {
 @Override
 void turnOn() {
     System.out.println("Light is now glowing.");
 }

 @Override
 void turnOff() {
     System.out.println("Light is turned off.");
 }
}

public class AssignmentDay5_3 {
    public static void main(String[] args) {
        Appliance fan = new Fan();
        Appliance light = new Light();

        fan.turnOn();
        fan.turnOff();

        light.turnOn();
        light.turnOff();
    }
}

