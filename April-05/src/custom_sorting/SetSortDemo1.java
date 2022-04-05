package custom_sorting;

import java.util.Set;
import java.util.TreeSet;

public class SetSortDemo1 {

	public static void main(String[] args) {

		Set<String> fruits = new TreeSet<String>();

		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Guava");

		// Collections.sort(fruits); -> We cannot sort set by using sort()

		System.out.println(fruits);

	}

}
