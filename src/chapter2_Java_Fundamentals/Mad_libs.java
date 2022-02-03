package chapter2_Java_Fundamentals;

import java.util.Scanner;

public class Mad_libs {
	/*
	 * Create a program that asks a user for a season of the year, then a whole
	 * number, then adjective. Use the input to complete the sentence below then
	 * output the result:
	 * "On a [adjective] [season of the year] day, I drink a minimum of [whole number] cups of coffee."
	 */

	public static void main(String[] args) {
		// Step 1. Get a season of the year
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a season of the year.");
		String seasonString = scanner.nextLine();

		// Step 2. Get a whole number
		System.out.println("Enter a whole number.");
		int number = scanner.nextInt();
		scanner.nextLine(); // To avoid the return after integer input

		// Step 3. Get a adjective
		System.out.println("Enter a adjective.");
		String adjectiveString = scanner.nextLine();
		scanner.close();

		// Step 4. Process output sentence
		String outputString = "On a " + adjectiveString + " " + seasonString + " day, I drink a minimum of " + number
				+ " cups of coffee.";
		// Step 5. Display output
		System.out.println(outputString);

	}

}
