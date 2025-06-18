package arrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
	public static void main(StringExmaple[] args) {
		List<String> arrayList = Arrays.asList("Apple", "Banana", "Papaya");
		System.out.println("ArrayList: " + arrayList);

		// Accessing elements
		try {
		System.out.println(arrayList.get(3));
		}
		 catch (Exception e) {
			System.out.println("Index 3 out of bounds for length 3");
		}

//Removing an element
		arrayList.remove(1);
		System.out.println("After removal: " + arrayList);

	}
}
