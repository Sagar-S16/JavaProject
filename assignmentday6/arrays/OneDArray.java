package arrays;

public class OneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int number[] = {10,20,30,40};
		//2.Declaration + instantiation.then Initialization
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
//		arr[4] = 5;
		
	
		//3.Declaratiom first ,Instantiation later
//		int[] arr;
//		arr = new int[3];
//		arr[1] = 5;
//		arr[2] = 15;
//		arr[3] = 25;
		
//		traverse and print elements
	System.out.println("1D array elements:");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	}

}
