package chapter12_CollectionsFramework_Maps;

import java.util.HashMap;
import java.util.Map;

/*
 * Map is not a true collection, meaning it does not inherit from the Collection interface. 
 * However, it contains collection-like operations, which enable them to be used as collections.
 * Maps are used to hold key/value pairs.
 * An example for this would be a list of bank transactions 
 * where each Map entry has a unique transaction ID serving as the key and 
 * the value would be the actual transaction object.
 */
public class MapPractice {

	public static void main(String[] args) {
		Map<Object, Object> fruitCalories = new HashMap<>();
		fruitCalories.put("apple", 95);
		fruitCalories.put("lemon", 20);
		fruitCalories.put("banana", 105);
		fruitCalories.put("orange", 45);
		fruitCalories.put("lemon", 17);

		System.out.println(fruitCalories.size()); // 4
		System.out.println(fruitCalories); // {banana=105, orange=45, apple=95, lemon=17}
		System.out.println(fruitCalories.get("lemon")); // 17
		System.out.println(fruitCalories.entrySet()); // [banana=105, orange=45, apple=95, lemon=17]
		fruitCalories.remove("orange");
		System.out.println(fruitCalories); // {banana=105, apple=95, lemon=17}

		// Looping Through Using enhance/for-each for loop and entrySet method
		System.out.println("-----Looping Through Using enhance/for-each for loop and entrySet method-----");
		for (var entry : fruitCalories.entrySet()) {
			// System.out.println(entry.getValue());
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		// Looping Through Using forEach method and lambda expression
		System.out.println("-----Looping Through Using forEach method and lambda expression-----");
		fruitCalories.forEach((k, v) -> System.out.println(k + " - " + v));

	}

}
