package program_fundamentals;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
			System.out.println("Enter full name");
			String fullName = sc.nextLine();
			
			System.out.println("Enter Age");
			int age = sc.nextInt();
			
			System.out.println("Enter Gender(Male/Female):");
			String gender = sc.next();
			
			System.out.println("Enter GPA:");
			double gpa = sc.nextDouble();
			
			System.out.println("Enter Height in cms");
			float height = sc.nextFloat();
			
			System.out.println("Enter Grade");
			char grade = sc.next().charAt(0);
			
			System.out.println("Enter phone Number");
			long phone = sc.nextLong();
			
			System.out.println("Are you an International Student? (Yes/No):");
			boolean isInternational = sc.nextBoolean();
			
			System.out.println("Student Registrations");
			System.out.println(fullName);
			System.out.println(age);
			System.out.println(gender);
			System.out.println(gpa);
			System.out.println(height);
			System.out.println(grade);
			System.out.println(phone);
			System.out.println(isInternational);
		
			sc.close();
	
}

}
