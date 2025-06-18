package mbrdi_codingQues;
import java.util.Arrays;



import java.util.function.Function;
import java.util.stream.Collectors;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean result = isAnagram(str1, str2);
        System.out.println(str1 + " and " + str2 + " are anagrams: " + result);
    }

    public static boolean isAnagram(String s1, String s2) {
        // Normalize strings: remove spaces and convert to lowercase
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // If lengths differ, they can't be anagrams
        if (s1.length() != s2.length()) return false;

        // Use streams to count character frequencies
        var freq1 = s1.chars()
                     .mapToObj(c -> (char) c)
                     .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        var freq2 = s2.chars()
                     .mapToObj(c -> (char) c)
                     .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return freq1.equals(freq2);
    }
}
