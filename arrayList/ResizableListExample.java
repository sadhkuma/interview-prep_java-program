package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResizableListExample {
    public static void main(String[] args) {
        List<String> fixedSizeList = Arrays.asList("Apple", "Banana", "Papaya");
        
        //If you need a resizable list, you can create an ArrayList
        List<String> arrayList = new ArrayList<>(fixedSizeList);
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);
    }
}
