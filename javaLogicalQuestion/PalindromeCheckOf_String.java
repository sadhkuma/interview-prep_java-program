package javaLogicalQuestion;

import java.util.Scanner;

/*1. Palindrome Check- Write a function that checks if a given string is a palindrome.*/
public class PalindromeCheckOf_String {
	Scanner sc = new Scanner(System.in);
	String str = sc.next();

	int i = 0;
	int j = str.length() - 1;

	void ispalindrome() {
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				System.out.println("String is not  palindrome");
				System.exit(0);
			}
			i++;
			j--;
		}
		System.out.println("The string is a palindrome.");
	}

	public static void main(String[] args) {
		 System.out.println("Enter a string to check if it's a palindrome:");
		PalindromeCheckOf_String obj = new PalindromeCheckOf_String();
		obj.ispalindrome();

	}

}
