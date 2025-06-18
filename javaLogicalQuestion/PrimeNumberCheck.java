package javaLogicalQuestion;

public class PrimeNumberCheck {

	// Function to check if a number is prime
	public static boolean isPrime(int num) {
		// Check for numbers less than or equal to 1
		if (num <= 1) {
			return false;
		}

		// Check for number 2 and 3 (both are prime numbers)
		if (num == 2 || num == 3) {
			return true;
		}

		// Check for even numbers (other than 2)
		if (num % 2 == 0) {
			return false;
		}

		// Check for divisibility from 3 up to sqrt(num)
		for (int i = 3; i * i <= num; i += 2) { // i += 2 skips even numbers
			if (num % i == 0) {
				return false;
			}
		}

		// If no divisors are found, the number is prime
		return true;
	}

	public static void main(String[] args) {
		int num = 29; // Example number

		if (isPrime(num)) {
			System.out.println(num + " is a prime number.");
		} else {
			System.out.println(num + " is not a prime number.");
		}
	}
}
