package p3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("India", "New Delhi");
		map.put("Pakistan", "Islamabad");
		map.put("Nepal", "Kathmandu");
		map.put("France", "Paris");
		map.put("USA", "Wasington DC");
		map.put("SriLanka", "Columbo");

		System.out.println(map.size()); // 6
		System.out.println(map);

		map.put("USA", "NewYork");

		System.out.println(map.size()); // 6
		System.out.println(map);

		System.out.println(map.containsKey("Paris")); // false
		System.out.println(map.containsValue("Paris")); // true

		// How to get value using Key;
		String value = map.get("India");
		System.out.println(value);

		// How to remove the entry Key;
		// map.remove("Pakistan");
		// System.out.println(map);

		System.out.println("------------------------");

		// Accessing key-value from the map.

		// toArray() -> NO
		// index for loop -> NO
		// For each loop -> NO
		// Iterator -> NO

		Set<String> allKeys = map.keySet();

		for (String key : allKeys) {

			String val = map.get(key);

			System.out.println(key + " -- " + val);

		}

		System.out.println("------------------------");

		Collection<String> allValues = map.values();

		for (String val : allValues) {

			System.out.println(val);

		}

		System.out.println("------------------------");

		Set<Entry<String, String>> allEntries = map.entrySet();

		for (Entry<String, String> entry : allEntries) {

			String key = entry.getKey();
			String val = entry.getValue();

			System.out.println(key + " -- " + val);

		}

	}

}
