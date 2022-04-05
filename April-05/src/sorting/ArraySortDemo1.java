package sorting;

import java.util.Arrays;

public class ArraySortDemo1 {

	public static void main(String[] args) {

		String[] fruits = { "Banana", "Grapes", "Apple", "Orange", "Guava" };

		System.out.println("Before Sorting : " + Arrays.toString(fruits));

		Arrays.sort(fruits);

		System.out.println("After Sorting : " + Arrays.toString(fruits));

	}

}
