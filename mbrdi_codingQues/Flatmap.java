package mbrdi_codingQues;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flatmap {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("A");
        l.add("b");
        l.add("c");
        l.add("d");

        List<String> l1 = new ArrayList<>();
        l1.add("12");
        l1.add("2");
        l1.add("3");
        l1.add("4");

        // Combine both lists using flatMap
        List<String> combined = Stream.of(l, l1) // Stream of lists
                                      .flatMap(List::stream) // Flatten to a single stream of elements
                                      .collect(Collectors.toList()); // Collect into a single list

        System.out.println("Combined List: " + combined);
    }
}
