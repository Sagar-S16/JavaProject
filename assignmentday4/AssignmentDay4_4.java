package assignmentday4;

class Employee2 {
 protected String name;

 public Employee2(String name) {
     this.name = name;
 }


 public double calculateSalary() {
     return 0.0;
 }
}


class Manager2 extends Employee2 {
 private double baseSalary;
 private double bonus;

 public Manager2(String name, double baseSalary, double bonus) {
     super(name);
     this.baseSalary = baseSalary;
     this.bonus = bonus;
 }

 @Override
 public double calculateSalary() {
     return baseSalary + bonus;
 }
}


class Developer extends Employee2 {
 private double baseSalary;
 private int overtimeHours;
 private double overtimeRate;

 public Developer(String name, double baseSalary, int overtimeHours, double overtimeRate) {
     super(name);
     this.baseSalary = baseSalary;
     this.overtimeHours = overtimeHours;
     this.overtimeRate = overtimeRate;
 }

 @Override
 public double calculateSalary() {
     return baseSalary + (overtimeHours * overtimeRate);
 }
}


public class AssignmentDay4_4 {
 public static void main(String[] args) {
     Employee2 manager = new Manager2("Sagar S", 120000, 15000);
     Employee2 developer = new Developer("Sunay", 80000, 10, 1000);

     System.out.println(manager.name + " : " + manager.calculateSalary());
     System.out.println(developer.name + ": " + developer.calculateSalary());
 }
}

