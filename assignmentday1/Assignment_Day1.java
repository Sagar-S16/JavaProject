package assignmentday1;
public class Assignment_Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//factorial
		  int num = 5;
		        long factorial = 1;
		        for (int i = 1; i <= num; i++) {
		            factorial *= i;
		        }
		        System.out.println(factorial);
		    
		        
		        
		 //Palindrome Number
		    
		        String input = "madam";
		        String reversed = "";

		                for (int i = input.length() - 1; i >= 0; i--) {
		                    reversed += input.charAt(i);
		                }

		                if (input.equals(reversed)) {
		                    System.out.println(input + " is a palindrome.");
		                } else {
		                    System.out.println(input + " is not a palindrome.");
		                }
		 //Palindrome number in Integer
		                
		                int num2 = 121;
		                int original = num2;
		                int rem = 0;
		                int rev = 0;

		                while (num2 > 0) {
		                    rem = num2 % 10;
		                    rev = (rev * 10) + rem;
		                    num2 = num2 / 10;
		                }

		                if (original == rev) {
		                    System.out.println(original + " is a Palindrome Number");
		                } else {
		                    System.out.println(original + " is Not a Palindrome Number");
		                }
		                
		  //Prime Number    
		                
		                int num1 = 29;
		                boolean isPrime = true;

		                if (num1 <= 1) {
		                    isPrime = false;
		                } else {
		                    for (int i = 2; i < num1; i++) {
		                        if (num1 % i == 0) {
		                            isPrime = false;
		                            break;
		                        }
		                    }
		                }

		                if (isPrime) {
		                    System.out.println(num + " is a prime number.");
		                } else {
		                    System.out.println(num + " is not a prime number.");
		                }


		//Swap two numbers 
	
							int a = 5;
							int b = 10;
							
							a = a + b; 
							b = a - b; 
							a = a - b; 
							
							System.out.println("a = " + a);
							System.out.println("b = " + b);
		
		//Fibonacci Series
							
	 }}

//public class SwapNumbers {
//    public static void main(String[] args) {
//        int a = 5, b = 10;
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println("a = " + a + ", b = " + b);
//    }
//}
//
//public class LargestNumber {
//    public static void main(String[] args) {
//        int a = 25, b = 42, c = 17;
//        if (a >= b && a >= c)
//            System.out.println("Largest: " + a);
//        else if (b >= a && b >= c)
//            System.out.println("Largest: " + b);
//        else
//            System.out.println("Largest: " + c);
//    }
//}
//
//public class Factorial {
//    public static void main(String[] args) {
//        int num = 5;
//        long fact = 1;
//        for (int i = 1; i <= num; i++) {
//            fact *= i;
//        }
//        System.out.println("Factorial: " + fact);
//    }
//    
//    }
//
//public class PalindromeCheck {
//    public static void main(String[] args) {
//        int num = 121, reversed = 0, original = num;
//        while (num != 0) {
//            reversed = reversed * 10 + num % 10;

//            num /= 10;
//        }
//        System.out.println(original == reversed ? "Palindrome" : "Not a palindrome");
//    }
//}
//
//public class FibonacciSeries {
//    public static void main(String[] args) {
//        int n = 10, a = 0, b = 1;
//        System.out.print("Fibonacci: ");
//        for (int i = 1; i <= n; i++) {
//            System.out.print(a + " ");
//            int next = a + b;
//            a = b;
//            b = next;
//        }
//    }
//}
//
//public class DigitCount {
//    public static void main(String[] args) {
//        int num = 12345, count = 0;
//        while (num != 0) {
//            count++;
//            num /= 10;
//        }
//        System.out.println("Total digits: " + count);
//    }
//}
//
//public class ReverseDigits {
//    public static void main(String[] args) {
//        int num = 1234, reversed = 0;
//        while (num != 0) {
//            reversed = reversed * 10 + num % 10;
//            num /= 10;
//        }
//        System.out.println("Reversed: " + reversed);
//    }
//}
//
//public class SumOfDigits {
//    public static void main(String[] args) {
//        int num = 1234, sum = 0;
//        while (num != 0) {
//            sum += num % 10;
//            num /= 10;
//        }
//        System.out.println("Sum of digits: " + sum);
//    }
//}
//
//
//public class ArmstrongCheck {
//    public static void main(String[] args) {
//        int num = 153, original = num, sum = 0;
//        while (num != 0) {
//            int digit = num % 10;
//            sum += digit * digit * digit;
//            num /= 10;
//        }
//        System.out.println(original == sum ? "Armstrong number" : "Not an Armstrong number");
//    }
//}
//
//public class PrimeCheck {
//    public static void main(String[] args) {
//        int num = 29;
//        boolean isPrime = true;
//        if (num <= 1) isPrime = false;
//        else {
//            for (int i = 2; i <= Math.sqrt(num); i++) {
//                if (num % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//        System.out.println(isPrime ? "Prime number" : "Not a prime number");
//    }
//}

