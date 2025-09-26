package exceptions;

import java.io.*;

//Custom Exception (user-defined)
class CustomException extends Exception {
 public CustomException(String message){
     super(message);
     System.out.println(message);
 }
}

public class ExceptionEx {

 // Method that declares 'throws'
 public static void riskyOperation(String input) throws IOException, CustomException {
    
     try {
	        	 if (input == null) {
	                 // Throw custom exception if input is null
	                 throw new CustomException("Input cannot be null.");
	             }
         FileWriter writer = new FileWriter("Example.txt");
         writer.write("User input: " + input);
         writer.close();
         System.out.println("Data written successfully!");
         
         FileReader reader = new FileReader("Example.txt");
         BufferedReader br = new BufferedReader(reader);
         System.out.println(br.readLine());
//         System.out.println(reader.read());
         System.out.println("Read");
         
     } catch (IOException e) {
         System.out.println("Exception occurred: " + e.getMessage());
         e.printStackTrace(); // shows full details
     }
 }

 public static void main(String[] args) {
     try {
         // Example 1: ArithmeticException
         int result = 10 / 0; // dividing by zero
         System.out.println(result);

         // Example 2: ArrayIndexOutOfBoundsException
         int[] arr = {1, 2, 3};
         System.out.println(arr[6]); // invalid index

         // Example 3: NumberFormatException
         int num = Integer.parseInt("10"); // invalid number
         System.out.println(num);

         // Example 4: CustomException + IOException
         riskyOperation(null);

     }
     // Catch exceptions separately
     catch (ArithmeticException e) {
     		System.out.println("Number cannot divisible by 0");
         System.out.println("Caught ArithmeticException : " + e.getMessage());
     }
     catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Caught ArrayIndexOutOfBoundsException : " + e.getMessage());
     }
     catch (NumberFormatException e) {
         System.out.println("Caught NumberFormatException : " + e.getMessage());
     }
     catch (CustomException e) {
         System.out.println("Caught CustomException : " + e.getMessage());
     }
     catch (IOException e) {
         System.out.println("Caught IOException : " + e.getMessage());
     }
     // General fallback
     catch (Exception e) {
         System.out.println("Caught General Exception : " + e.getMessage());
     }
     // Always executes
     finally {
         System.out.println("Finally block executed: Cleaning up resources.");
     }
     
     System.out.println("After all Exceptions");

 }
}
