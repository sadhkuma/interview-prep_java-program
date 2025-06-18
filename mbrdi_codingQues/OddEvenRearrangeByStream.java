package mbrdi_codingQues;

import java.util.*;
import java.util.stream.*;

public class OddEvenRearrangeByStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 17, 70, 15, 22, 65, 21, 90);

        List<Integer> rearranged = Stream.concat(
                                        list.stream().filter(n -> n % 2 != 0), // odd numbers
                                        list.stream().filter(n -> n % 2 == 0)  // even numbers
                                    )
                                    .collect(Collectors.toList());

        System.out.println("Rearranged list: " + rearranged);
    }
}
