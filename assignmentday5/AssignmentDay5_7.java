package assignmentday5;

import java.util.HashMap;
import java.util.Map;

public class AssignmentDay5_7 {
    public static void main(String[] args) {
        
        Map<Integer, String> employeeData = new HashMap<>();
        
        
        
        employeeData.put(1001, "Sagar");
        employeeData.put(1002, "Skandha");
        employeeData.put(1003, "Ankush");
        employeeData.put(1004, "Vivek");
        employeeData.put(1005, "Arya");

       
        System.out.println("Approach 1: Using employee IDs");
        for (Integer id : employeeData.keySet()) {
            System.out.println("ID: " + id + ", Name: " + employeeData.get(id));
        }

        
        System.out.println("\nApproach 2: Using key-value pairs");
        for (Map.Entry<Integer, String> entry : employeeData.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}

