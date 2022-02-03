package chapter3_IfElseNestedSwitch_RelationalLogicalOperators;

import java.util.Scanner;

/*
 * IF Statement. All salespeople get a payment of $1000 a week. Salespeople who
 * exceed 10 sales get an additional bonus of $250.
 */

public class SalryCalculator {

	public static void main(String[] args) {
		// Step 1. Initialize known values
		int salary = 1000;
		int bonus = 250;
		int quota = 10;

		// Step 2. Get values for the unknown
		System.out.println("How many sales did the employee make this week?");
		Scanner scanner = new Scanner(System.in);
		int sales = scanner.nextInt();
		scanner.close();

		// Step 3. Quick detour for the bonus earners
		if (sales > quota) {
			salary = salary + bonus;
		}

		// Step 4. Display output
		System.out.println("The employee's pay is $" + salary);

	}

}
