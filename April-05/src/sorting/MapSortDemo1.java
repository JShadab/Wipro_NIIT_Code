package sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSortDemo1 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		map.put("India", "New Delhi");
		map.put("Pakistan", "Islamabad");
		map.put("Nepal", "Kathmandu");
		map.put("France", "Paris");
		map.put("USA", "Wasington DC");
		map.put("SriLanka", "Columbo");

		System.out.println(map);

		Map<String, String> treeMap = new TreeMap<>();

		treeMap.put("India", "New Delhi");
		treeMap.put("Pakistan", "Islamabad");
		treeMap.put("Nepal", "Kathmandu");
		treeMap.put("France", "Paris");
		treeMap.put("USA", "Wasington DC");
		treeMap.put("SriLanka", "Columbo");

		System.out.println(treeMap);
	}

}
