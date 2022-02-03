package chapter3_IfElseNestedSwitch_RelationalLogicalOperators;

import java.util.Scanner;

/*
 * The If-Else Statement
 * If a certain situation occurs, do something. Otherwise, do something else.
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulations message.
 * For those who don't, they are informed of how many sales they were short.
 */
public class QuataCalculator {

	public static void main(String[] args) {
		// Step 1. Initialize known values
		int quota = 10;

		// Step 2. Get values for the unknown
		System.out.println("Enter the number of sales you made this week:");
		Scanner scanner = new Scanner(System.in);
		int sales = scanner.nextInt();
		scanner.close();

		// Step 3. Make a decision on the path to take - Output
		if (sales >= quota) {
			System.out.println("Congrats! You've met your quota");
		} else {
			int salesShort = quota - sales;
			System.out.println("You did not make your quota. You were " + salesShort + " sales short");
		}

	}

}
