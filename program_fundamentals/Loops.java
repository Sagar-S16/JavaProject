package program_fundamentals;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For loop
		
		for(int i = 0;i<=5 ; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//While loop
		int j = 5;
		while(j >=1) {
			System.out.print(j + " ");
			j--;
		}
		System.out.println();
		
		
		//Do while loop
		int k = 1;
		do {
			System.out.print( k + " ");
			k++;
		} while(k<=5);
			System.out.println();
			
			
		//1.for loop : Displaying product IDs
			System.out.println("For loop: List of Products Ids in the Store");
			for(int productId = 101; productId <=105 ; productId++) {
				System.out.print(productId + " ");
			}
			System.out.println();
			
			
			
	//2.While loop : Displaying remaining stock of a product
			System.out.println("While loop: Remaining stock for a product");
			int stock = 5;
			while(stock > 0) {
				System.out.print(stock + " ");
				stock--;
			}
			System.out.println();
			
	//3.Do-While Loop :Displaying loyalty points earned by a customer
			
			System.out.println("Do-While loop: loyalty points earned by a customer");
			int points = 1;
			do {
				System.out.print(points + " ");
				points++;
			} while(points <=5);
			System.out.println();
			
	 //4.For- each (enhanced for loop)
			String[]  products = {"Laptop","Phone","Headphones","Mouse"};
			for(String product : products) {
				System.out.println(product);
			}
		}
	}


