package sequntial__parrallelStream;

import java.util.Arrays;
import java.util.List;

public class SequestialStreamDemo {
public static void main(String[] args) {
	List<String> asList = Arrays.asList("Hello","G","E","E","K","S!");
	asList.stream().forEach(s->System.out.println(s));
	
	List<Integer> asList2 = Arrays.asList(1,2,3,4);
	asList2.stream().filter(n->n%2==0).forEach(System.out::println);
}
}
