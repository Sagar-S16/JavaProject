package arrays;

public class TwoDArrayExample {

	public static void main(String[] args) {
		
		int matrix[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		//Traverse and print elements
		for(int[] element : matrix) {
			
			for(int element2 : element) {
				System.out.print(element2 + " ");
			}
			System.out.println();
	}
		  System.out.println();
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
