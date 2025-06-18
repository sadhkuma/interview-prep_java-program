package mbrdi_codingQues;

import java.util.*;

public class JavaCounthroughStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "python", "Java", "c++", "java", "JavaScript", "JAVA");

        long count = list.stream()
                         .filter(s -> s.equalsIgnoreCase("java"))
                         .count();

        System.out.println("\"java\" appeared " + count + " times.");
    }
}
