package flatMap;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example2 {
	public static void main(String[] args) {
		List<String> sentences = Arrays.asList("hello world", "java streams", "flat map example");

		List<String> collect = sentences.stream().flatMap(s -> Stream.of(s.split(" "))).collect(Collectors.toList());
		System.out.println(collect);

		// Exmaple using String Array
		List<String[]> wordList = Arrays.asList(new String[] { "hello", "world" }, new String[] { "Java", "stream" },
				new String[] { "python", "program" });

		// perfoming flatMap
		List<String> AllWords = wordList.stream().flatMap(Arrays::stream).collect(Collectors.toList());
		System.out.println("AllWords:"+AllWords);
		
		//Using flatMap with optional
		List<String> optinalStrings = Arrays.asList("Apple", null, "Banana",null,"Grapes");
		List<String> nonNulStrings = optinalStrings.stream().flatMap(s->s==null ? Stream.of():Stream.of(s)).collect(Collectors.toList());
		System.out.println("Non-null strings:"+nonNulStrings);
		

	}
}
