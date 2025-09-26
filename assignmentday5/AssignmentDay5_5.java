package assignmentday5;

import java.util.HashMap;
import java.util.Map;

public class AssignmentDay5_5 {
    public static void main(String[] args) {
      
        Map<Integer, String> employeeMap = new HashMap<>();

        
        employeeMap.put(101, "Sagar S");
        employeeMap.put(102, "Ankush");
        employeeMap.put(103, "Arya");
        employeeMap.put(104, "Shreya");

       
        System.out.println("Employee Directory:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}


