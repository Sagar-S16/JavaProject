package program_fundamentals;
import java.util.Scanner;
import java.util.Random;
public class EmployeeOnboarding {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Store Employee Information
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Full Name: ");
        String fullName = sc.nextLine();

        System.out.print("Enter Years of Experience: ");
        double experience = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("Enter Highest Degree (Bachelors, Masters, PhD): ");
        String degree = sc.nextLine();

        System.out.print("Do you have Security Clearance? (true/false): ");
        boolean clearance = sc.nextBoolean();

        // 2. Salary Negotiation
        double baseSalary = 50000;
        double negotiatedSalary = baseSalary;

        if (experience > 5) {
            negotiatedSalary += 15000;
        } else if (experience >= 3) {
            negotiatedSalary += 5000;
        }

        // 3. Calculate Signing Bonus
        double bonus = negotiatedSalary * 0.05; // 5% of salary
        if (clearance) {
            bonus += 2000;
        }

        // 4. Assign Department (using switch)
        String department;
        switch (degree) {
            case "PhD":
                department = "R&D";
                break;
            case "Masters":
                department = "Data Analytics";
                break;
            case "Bachelors":
                department = "Operations";
                break;
            default:
                department = "General Admin";
        }

        // 5. Generate Temporary Password (for loop + Random)
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
        String tempPassword = "";
        Random r = new Random();
        for (int i = 0; i < 8; i++) {
            int index = r.nextInt(chars.length());
            tempPassword += chars.charAt(index);
        }

        // 6. Display Onboarding Summary
        System.out.println("\n===== Employee Onboarding Summary =====");
        System.out.println("Employee ID: " + empId);
        System.out.println("Full Name: " + fullName);
        System.out.println("Department: " + department);
        System.out.println("Years of Experience: " + experience);
        System.out.println("Negotiated Salary: ₹" + negotiatedSalary);
        System.out.println("Signing Bonus: ₹" + bonus);
        System.out.println("Temporary Password: " + tempPassword);

        
        if (department.equals("R&D") && clearance) {
            System.out.println("Special Note: Grant lab access and schedule safety briefing.");
        }

        sc.close();
	}}

