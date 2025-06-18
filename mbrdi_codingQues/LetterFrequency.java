package mbrdi_codingQues;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//Take your name and count the occurrence of each letter and sort by stream java

public class LetterFrequency {
    public static void main(String[] args) {
        String name = "Sadhna";

        Map<Character, Long> frequency = name.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Sort by frequency in descending order
        List<Map.Entry<Character, Long>> sorted = frequency.entrySet().stream()
            .sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
            .collect(Collectors.toList());

        // Print result
        sorted.forEach(entry ->
            System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}

