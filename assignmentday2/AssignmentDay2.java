package assignmentday2;

import java.util.Arrays;
import java.util.Scanner;

public class AssignmentDay2 {

	public static void main(String[] args) {
		//1.Check whether a given string is a palindrome (same forward & backward).
		String name = "madam";
		String  rev = "";
		for(int i = name.length()-1;i>=0;i--) {
			rev = rev + name.charAt(i);
			
		}
		System.out.println(rev);
		
		//Count Vowels & Consonants
		String str = "Skandha";
		int count = 0;
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
		    char ch = str.charAt(i);
		    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		        count++;
		    }
		}

		System.out.println(count);
		
		//Reverse Words in a Sentence
		String sentence = "Java is fun";
        String[] words = sentence.trim().split("\\s+");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i != 0)
            	System.out.print(" ");
        }
        
        
        //Split a Sentence into Words
        System.out.println();
        String sentence1 = "Java is fun";
        String[] words1 = sentence1.split(" ");
        System.out.print(Arrays.toString(words1));
        

        //if Two Strings are Anagrams
        System.out.println();
        String str1 = "Listen";
        String str2 = "Silent";

        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        
        if (str1.length() != str2.length()) {
            System.out.println("Not anagrams");
            return;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not anagrams");
        }
       
            
           // Find the transpose of a given 2D matrix.
            int[][] matrix1 = {
                    {5,6,7},
                    {1,2,3}
                };

                int rows1 = matrix1.length;
                int cols1 = matrix1[0].length;

                int[][] transpose1 = new int[cols1][rows1];

                
                for (int i = 0; i < rows1; i++) {
                    for (int j = 0; j < cols1; j++) {
                        transpose1[j][i] = matrix1[i][j];
                    }
                }

                
                System.out.println("Transposed Matrix in 2D:");
                for (int i = 0; i < cols1; i++) {
                    for (int j = 0; j < rows1; j++) {
                        System.out.print(transpose1[i][j] + " ");
                    }
                    System.out.println();
                }
                
          //Find the sum of the main diagonal elements of a square matrix.
                System.out.println();
                int[][] matrix2 = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                    };

                    int sum = 0;
                    for (int i = 0; i < matrix2.length; i++) {
                        sum += matrix2[i][i];
                    }

                    System.out.println("sum = " + sum);
                    
            //Write a program to calculate the sum of each row in a 2D array.
                    System.out.println();
                    
                    int[][] matrix3 = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                    };

                    
                    for (int i = 0; i < matrix3.length; i++) {
                    	
                    	int rowSum = 0;
                            for (int j = 0; j < matrix3[i].length; j++) {
                            	rowSum += matrix3[i][j];
                          }
                            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
                        
                    }

             //Count Even and Odd Numbers (1D)
                    System.out.println();
                    int[] numbers = {10, 25, 19, 26, 15, 40, 33}; 
                    int evenCount = 0;
                    int oddCount = 0;

                    for (int num : numbers) {
                        if (num % 2 == 0) {
                            evenCount++;
                        } else {
                            oddCount++;
                        }
                    }

                    System.out.println("Number of even numbers: " + evenCount);
                    System.out.println("Number of odd numbers: " + oddCount);
                    
         // Check whether a given number is present in the array or not using traversal.
                    Scanner sc = new Scanner(System.in);

                    
                    System.out.print("Enter number of elements: ");
                    int n = sc.nextInt();

                    int[] arr = new int[n];

                    
                    System.out.println("Enter " + n + " elements:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }

                    
                    System.out.print("Enter the number to search: ");
                    int target = sc.nextInt();

                   
                    boolean found = false;
                    for (int num : arr) {
                        if (num == target) {
                            found = true;
                            break;
                        }
                    }

                    if (found) {
                        System.out.println(target + " is present in the array.");
                    } else {
                        System.out.println(target + " is NOT present in the array.");
                    }

                    sc.close();


	}

}

