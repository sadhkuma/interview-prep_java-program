package mbrdi_codingQues;

import java.util.Arrays;
//take an array and print all odd numbers in left side and even numbers in right side in single array. 

public class OddEvenRearrange {
	public static void main(String[] args) {
		int[] arr = { 12, 17, 70, 15, 22, 65, 21, 90 };

		int[] result = rearrangeOddEven(arr);

		System.out.println("Rearranged array: " + Arrays.toString(result));
	}

	public static int[] rearrangeOddEven(int[] arr) {
		int[] result = new int[arr.length];
		int left = 0;
		int right = arr.length - 1;

		for (int num : arr) {
			if (num % 2 != 0) {
				result[left++] = num; // odd numbers to the left
			} else {
				result[right--] = num; // even numbers to the right
			}
		}

		return result;
	}
}
