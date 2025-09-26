package collections;

import java.util.HashMap;
import java.util.Map;

public class EmployeeTracker {
    public static void main(String[] args) {
       
        Map<Integer, String> employees = new HashMap<>();

        
        employees.put(101, "Alice");
        employees.put(102, "Bob");
        employees.put(103, "Charlie");
        employees.put(104, "Diana");
        employees.put(105, "Ethan");

        
        System.out.println("Employee List:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
