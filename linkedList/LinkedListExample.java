package linkedList;

import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {

		List<String> arrayList = Arrays.asList("Apple", "Banana", "Papaya");

//converted into lnkedList
		LinkedList<String> linkedList = new LinkedList<>(arrayList);
		System.out.println("List: " + arrayList);

		// Accessing elements
		System.out.println("First element: " + linkedList.get(0));

// Removing an element
		linkedList.remove(1);
		System.out.println("After removal: " + linkedList);

	}

}
