package chapter12_CollectionsFramework_Maps;

/*
 * List is a collection where the elements are ordered.
 * List can contain duplicate elements.
 * An example of where List might be used would be the phone numbers from your call history. 
 * They are listed in order and some numbers may appear more than once.
 */
import java.util.ArrayList;
import java.util.List;

public class ListPractice {

	public static void main(String[] args) {
		List<String> fruit = new ArrayList<String>();
		fruit.add("apple");
		fruit.add("lemon");
		fruit.add("banana");
		fruit.add("orange");
		fruit.add("lemon");

		System.out.println(fruit.get(2)); // banana
		System.out.println(fruit.size()); // 5
		System.out.println(fruit); // [apple, lemon, banana, orange, lemon]

		// Looping Through Using iterator
		System.out.println("-----Looping Through Using iterator-----");
		var i = fruit.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		// Looping Through Using enhance/for-each for loop
		System.out.println("-----Looping Through Using enhance/for-each for loop-----");
		for (String item : fruit) {
			System.out.println(item);
		}

		// Looping Through Using forEach method and lambda expression
		System.out.println("-----Looping Through Using forEach method and lambda expression-----");
		fruit.forEach(x -> System.out.println(x));

		// Looping Through Using forEach method and shortest lambda expression
		System.out.println("-----Looping Through Using forEach method and shortest lambda expression-----");
		fruit.forEach(System.out::println);

	}

}
