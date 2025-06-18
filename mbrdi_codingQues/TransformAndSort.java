package mbrdi_codingQues;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*program - input -[1,2,3,4,5] print this list 
now try to print 1,4,3,8,5 if it is even now with minimal operation
 sort it in descending */

public class TransformAndSort {
	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> result = input.stream().map(n -> n % 2 == 0 ? n * 2 : n) // Double even numbers
				.sorted((a, b) -> b - a) // Sort in descending order
				.collect(Collectors.toList());

		System.out.println(result); // Output: [8, 5, 4, 3, 1]
	}
}
