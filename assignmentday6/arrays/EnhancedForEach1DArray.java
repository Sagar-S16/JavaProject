package arrays;

public class EnhancedForEach1DArray {

	public static void main(String[] args) {
	
        int[] numbers = {17, 45, 67, 23, 93, 34};
        int max = numbers[0]; 

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println(max);

	}

}
