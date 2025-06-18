package comparable;

import java.util.*;

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Alice"));
        list.add(new Student(1, "Bob"));
        list.add(new Student(2, "Charlie"));

        Collections.sort(list); // Uses compareTo
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
