package chapter12_CollectionsFramework_Maps;

/*
 * Queue is a collection of ordered elements, 
 * which is typically used to hold items that are going to be processed in some way.
 * An example use case would be the people in the checkout line at a supermarket. 
 * People who are new to the queue are added at the end and 
 * the processing of the queue is handled from the beginning. 
 * This type of processing is well known as first in-first out (FIFO).
 */
import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {

	public static void main(String[] args) {
		Queue<String> fruit = new LinkedList<String>();
		fruit.add("apple");
		fruit.add("lemon");
		fruit.add("banana");
		fruit.add("orange");
		fruit.add("lemon");

		System.out.println(fruit.size()); // 5
		System.out.println(fruit); // [apple, lemon, banana, orange, lemon]

		fruit.remove();
		System.out.println(fruit); // [lemon, banana, orange, lemon]
		System.out.println(fruit.peek()); // lemon
		
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
