package javaLogicalQuestion;

import java.util.Arrays;

public class AnagramCheck {

	// Function to check if two strings are anagrams
	public static boolean areAnagrams(String str1, String str2) {
		// Remove spaces and convert to lowercase for case-insensitive comparison
		str1 = str1.replaceAll("\\s+", "").toLowerCase();
		str2 = str2.replaceAll("\\s+", "").toLowerCase();

		// Check if lengths are equal, if not they can't be anagrams
		if (str1.length() != str2.length()) {
			return false;
		}

		// Convert both strings to character arrays
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		// Sort the character arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		// Compare the sorted arrays
		return Arrays.equals(arr1, arr2);
	}

	public static void main(String[] args) {
		String str1 = "Listen";
		String str2 = "Silent";

		if (areAnagrams(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are anagrams.");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams.");
		}
	}
}
