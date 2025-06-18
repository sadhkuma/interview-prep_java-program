package javaLogicalQuestion;

/*2. FizzBuzz- Write a program that prints the numbers from 1 to 100 with specific rules for multiples of 3 and 5.*/
public class FizzBuzz {

	public static void main(String[] args) {
		// Loop through numbers from 1 to 100
		for (int i = 1; i <= 100; i++) {

			// Check if the number is a multiple of both 3 and 5
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			// Check if the number is a multiple of 3
			else if (i % 3 == 0) {
				System.out.println("Fizz");
			}
			// Check if the number is a multiple of 5
			else if (i % 5 == 0) {
				System.out.println("Buzz");
			}
			// If the number is neither a multiple of 3 nor 5, print the number
			else {
				System.out.println(i);
			}
		}
	}
}
