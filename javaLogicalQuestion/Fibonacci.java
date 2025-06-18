package javaLogicalQuestion;

public class Fibonacci {

	// Function to return the nth Fibonacci number using recursion
	public static int fibonacci(int n) {
		if (n == 0) {
			return 0; // Base case for n = 0
		} else if (n == 1) {
			return 1; // Base case for n = 1
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
		}
	}

	public static void main(String[] args) {
		int n = 10; // Change this to any number to get the nth Fibonacci number
		System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));
	}
}
//normal fibonacci series program

//class Fibonacci {
//	public static void main(String[] args) {
//		int a = 0;
//		int b = 1;
//		System.out.println(a + " " + b);
//		int c;
//		for (int i = 1; i < 10; i++) {
//			c = a + b;
//			System.out.println(" " + c);
//			a = b;
//			b = c;
//		}
//	}
//}
