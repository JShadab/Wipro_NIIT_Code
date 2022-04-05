package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortDemo1 {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<String>();

		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Guava");

		System.out.println("Before Sorting List: " + fruits);

		Collections.sort(fruits);

		System.out.println("After Sorting List: " + fruits);

	}

}
