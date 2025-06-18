package comparator;

import java.util.*;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Alice"));
        list.add(new Student(1, "Bob"));
        list.add(new Student(2, "Charlie"));

        Collections.sort(list, new NameComparator()); 
        //Collections.sort(list,new IdComparator());
        // Uses compare
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
