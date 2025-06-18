package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*i/p = Array of {"Jeff", "Bill", "Mark","Markus","Daniel"}
o/p sorted list of names having length more than 5 - {"Markus", "Daniel"}*/
public class Filter {
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("Jeff", "Bill", "Mark","Markus","Daniel");
		List<String> collect = asList.stream().filter(s->s.length()>5).collect(Collectors.toList());
		System.out.println(collect);

	}
}
