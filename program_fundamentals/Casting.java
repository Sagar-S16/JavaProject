package program_fundamentals;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Real time example : Employee salary and Experience 
		//1.Implicit Casting(Widening)
		
		int experienceYears = 5;
		double salary = 5000 + (experienceYears * 1200);
		double updatedSalary = salary;
				System.out.println("Implicit : Employee Salary = $" + updatedSalary);
				
		//2.Explicit Casting(Narrowing)
				double bonus = 3456.78;
				int roundedBonus = (int) bonus;
				System.out.println("Explicit - $" + roundedBonus);
				
		//3.Another scenario
				float productRating = 4.8f;
				int rating = (int) productRating;
				System.out.println("Explicit - $" + rating);
	}

}
