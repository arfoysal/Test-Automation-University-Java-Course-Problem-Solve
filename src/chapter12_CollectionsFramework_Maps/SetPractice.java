package chapter12_CollectionsFramework_Maps;

import java.util.HashSet;
import java.util.Set;

/*
 * Collections
 * A Collection is an object that holds references to other objects. 
 * These are data structures and the objects within the collection are known as elements.
 * Set
 * Set is a Unordered collection which cannot contain duplicate elements.
 * An example use case for Set would be a standard deck of 52 playing cards,
 * where each card would be an element in the collection and each of them are unique.
 */
public class SetPractice {

	public static void main(String[] args) {
		Set<String> fruit = new HashSet<String>();
		fruit.add("apple");
		fruit.add("lemon");
		fruit.add("banana");
		fruit.add("orange");
		fruit.add("lemon");

		System.out.println(fruit.size()); // 4
		System.out.println(fruit); // [banana, orange, apple, lemon]

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
