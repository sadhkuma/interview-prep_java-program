package flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
	public static void main(String[] args) {
		List<List<Integer>> asList = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5),
				Arrays.asList(6, 7, 8, 9));
		
		List<Integer> flattenedList = asList.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(flattenedList);
	}
}
