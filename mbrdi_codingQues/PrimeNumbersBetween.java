package mbrdi_codingQues;

import java.util.stream.IntStream;

public class PrimeNumbersBetween {
	public static void main(String[] args) {
		IntStream.range(1, 200)
		         .filter(PrimeNumbersBetween::isPrime)
		         .forEach(System.out::println);
		
	}
	private static boolean isPrime(int number) {
		if(number<1) {
			return false;
		}
		
		return IntStream.rangeClosed(2, (int)Math.sqrt(number))
				.noneMatch(n->number%n==0);
 
	}
}
