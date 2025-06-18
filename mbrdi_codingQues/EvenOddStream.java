package mbrdi_codingQues;

import java.util.stream.IntStream;

//Even and odd number from 1 to 100 - code 
public class EvenOddStream {
    public static void main(String[] args) {
        System.out.println("Even Numbers:");
        IntStream.rangeClosed(1, 100)
                 .filter(n -> n % 2 == 0)
                 .forEach(n -> System.out.print(n + " "));

        System.out.println("\n\nOdd Numbers:");
        IntStream.rangeClosed(1, 100)
                 .filter(n -> n % 2 != 0)
                 .forEach(n -> System.out.print(n + " "));
    }
}
