package mbrdi_codingQues;

import java.util.*;

public class JavaCounter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "python", "Java", "c++", "java", "JavaScript", "JAVA");

        int count = 0;
        for (String str : list) {
            if (str.equalsIgnoreCase("java")) {
                count++;
            }
        }

        System.out.println("\"java\" appeared " + count + " times.");
    }
}

