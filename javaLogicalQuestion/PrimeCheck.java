package javaLogicalQuestion;

import java.util.Scanner;

public class PrimeCheck {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = scanner.nextInt();
//
//        if (isPrime(num)) {
//            System.out.println(num + " is a prime number.");
//        } else {
//            System.out.println(num + " is not a prime number.");
//        }
//
//        scanner.close();
//    }
//
//    public static boolean isPrime(int number) {
//        if (number <= 1) return false;
//        if (number == 2) return true;
//        if (number % 2 == 0) return false;
//
//        for (int i = 3; i <= Math.sqrt(number); i += 2) {
//            if (number % i == 0) return false;
//        }
//
//        return true;
//    }
//}
//
//

	public static void main(String[] args) {
		int num = 29;
		 if (isPrime(num)) {
           System.out.println(num + " is a prime number.");
      } else {
           System.out.println(num + " is not a prime number.");
       }
	}

	public static boolean isPrime(int number) {
		if (number <= 1)
			return false;
		if (number == 2)
			return true;
		if (number % 2 == 0)
			return false;

		for (int i = 3; i <= Math.sqrt(number); i += 2) {
			if (number % i == 0) {
			}
			return false;
		}
		return true;

	}
}
