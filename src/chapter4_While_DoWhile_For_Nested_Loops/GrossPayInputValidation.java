package chapter4_While_DoWhile_For_Nested_Loops;

import java.util.Scanner;

/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime more than of 40 hours.
 */
public class GrossPayInputValidation {

	public static void main(String[] args) {
		// Step 1. Initialize known variables
		int rate = 15;
		int maximumHours = 40;

		// Step 2. Get input for unknown variables
		System.out.println("How many hours did you work this week?");
		Scanner scanner = new Scanner(System.in);
		double hoursWorked = scanner.nextDouble();

		// step 3.Validate input - if not re-take input
		while (hoursWorked > maximumHours || hoursWorked < 1) {
			System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
			hoursWorked = scanner.nextDouble();
		}
		scanner.close();

		// Step 4. Calculate gross using valid input
		double gross = rate * hoursWorked;
		System.out.println("Gross pay: $" + gross);

	}

}
