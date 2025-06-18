
package javaLogicalQuestion;

import java.util.Scanner;

public class PalindromeCheckOf_StringUsingfuntionArgumnet {

	// Function to check if a string is a palindrome
	void isPalindrome(String str) {
		// Clean the input string: remove non-alphanumeric characters and convert to
		// lowercase
		str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		int i = 0;
		int j = str.length() - 1;

		// Check if the string is a palindrome
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				System.out.println("The string is not a palindrome.");
				return; // Exit the method if not a palindrome
			}
			i++;
			j--;
		}
		// If the loop completes, it's a palindrome
		System.out.println("The string is a palindrome.");
	}

	public static void main(String[] args) {
		// Create an object of PalindromeCheckOf_String
		Scanner sc = new Scanner(System.in);

		// Prompt user to enter a string
		System.out.println("Enter a string to check if it's a palindrome:");
		String input = sc.nextLine();

		// Create an instance of the class and check if the string is a palindrome
		PalindromeCheckOf_StringUsingfuntionArgumnet obj = new PalindromeCheckOf_StringUsingfuntionArgumnet();
		obj.isPalindrome(input);

		sc.close(); // Close the scanner to avoid resource leak
	}
}
