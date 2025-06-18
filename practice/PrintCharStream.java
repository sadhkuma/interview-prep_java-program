package practice;

import java.util.stream.IntStream;

public class PrintCharStream {
	public static void main(String[] args) {
		String input = "d2e3d3a1";

		String result = IntStream.range(0, input.length() / 2)// iterates over each character-number pair.
				.mapToObj(i -> {
					char c = input.charAt(i * 2);
					int count = Character.getNumericValue(input.charAt(i * 2 + 1));
					return String.valueOf(c).repeat(count);
				}).reduce("", String::concat);

		System.out.println(result); // Output: ddeeeddda
	}
}
