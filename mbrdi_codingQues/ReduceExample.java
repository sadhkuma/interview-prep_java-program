package mbrdi_codingQues;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceExample {
	public static void main(String[] args) {
//Sum of integers
		int sum = Stream.of(1, 2, 3, 4, 5).reduce(0, (a, b) -> a + b);
		System.out.println(sum); // Output: 15

		// other way
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
		// Use reduce() to compute the sum of the elements
		//Optional<Integer> sum1 = stream.reduce(Integer::sum);
		// Print the sum if present
		//sum1.ifPresent(System.out::println);
		
		//find max
		Optional<Integer> maxNumer = stream.reduce(Integer::max);
		System.out.println("max nhmber is:"+maxNumer.get());

		// Concatenate strings
		String result = Stream.of("Java", "8", "Streams").reduce("", (a, b) -> a + " " + b);
		System.out.println(result.trim()); // Output: Java 8 Streams

	}
}
