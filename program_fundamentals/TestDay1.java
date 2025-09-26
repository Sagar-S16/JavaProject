package program_fundamentals;

import java.util.Scanner;

public class TestDay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =1;
		for(int i = 25 ;i>= num ; i--) {
			if(i%5==0) {
				System.out.println(i);
			}
		}
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week (e.g., Monday, Friday): ");
        String day = scanner.nextLine().toLowerCase();

        switch (day) {
            case "monday":
                System.out.println("monday");
                break;
            case "tuesday":
                System.out.println("tuesday");
                break;
            case "wednesday":
                System.out.println("wednesday");
                break;
            case "thursday":
                System.out.println("thursday");
                break;
            case "friday":
                System.out.println("friday");
                break;
            case "saturday":
                System.out.println("saturday");
                break;
            case "sunday":
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid day");
        }

        scanner.close();	

	}

}
