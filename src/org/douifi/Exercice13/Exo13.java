package org.douifi.Exercice13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Map<Integer, String> firstMap = Map.ofEntries(
											Map.entry(3, "one"),
											Map.entry(4, "four"),
											Map.entry(5, "three"),
											Map.entry(6, "eleven"));

			Map<Integer, String> map = new HashMap<>(firstMap);
			System.out.println("values of map: " + map.values());
			System.out.println("values of keys: " + map.keySet());
		
			
			
			 //Q1
			for (Integer  mapkey : map.keySet()) {
					map.put(mapkey, (map.get(mapkey)).toUpperCase());
				}

			System.out.println("values of map after Uppercase: " + map.values());
			//Q2 on remplace null par " " 
			List<Integer> keys = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9,10);
			for (int key : keys) {
				if(map.get(key)==null) map.put(key, "");
				System.out.println( key+"  value = " + map.get(key));
				
			}
			// Q3 en utilise la methode putIfAbsent
			for (int key : keys) {
				map.putIfAbsent(key, "");
				System.out.println( key+"  value = " + map.get(key));
				
			}
			map.forEach((key, value) -> System.out.println(key + " = " + value));
	
	//Q4  en utilise la methode  computeIfAbsent
			List<String> words = List.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve");
			Map<Integer, List<String>> map2 = new HashMap<>();
			System.out.println("values of map sorted by length :");

			for (String value : words) {
				int key = value.length();
				map2.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
			}
			
			map2.forEach((key, value) -> System.out.println(key + " = " + value));
	//Q5  en utilise la methode  merge pour faire la concatination sans faire une liste
			
			
			Map<Integer, String> mergeMap = new HashMap<>();
			for (String word : words) {
			int key = word.length();
			mergeMap.merge(key, word,
			(existingValue, newValue) -> existingValue + "," + newValue);
			}
			System.out.println("\nMerge map:");
			mergeMap.forEach((key, value) -> System.out.println(key + " = " + value));
		}

}
