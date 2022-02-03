package chapter3_IfElseNestedSwitch_RelationalLogicalOperators;

import java.util.Scanner;

/*
 * NESTED IFS: If a certain situation occurs, check for the next situation.
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {

	public static void main(String[] args) {
		// Step 1. Initialize known values
		int requiredSalary = 30000;
		int requiredYearsEmployed = 2;

		// Step 2. Get values for the unknown
		System.out.println("Enter your salary:");
		Scanner scanner = new Scanner(System.in);
		double actualSalary = scanner.nextDouble();

		System.out.println("Enter the number of years with your current employer:");
		double actualYearsEmployed = scanner.nextDouble();
		scanner.close();
		
		// Step 3. Make decision
		if (actualSalary >= requiredSalary) {

			if (actualYearsEmployed >= requiredYearsEmployed) {
				System.out.println("Congrats! You qualify for the loan");
			} else {
				System.out.println(
						"Sorry, you must have worked at your current job " + requiredYearsEmployed + " years.");
			}
		} else {
			System.out.println("Sorry, you must earn at least $" + requiredSalary + " to qualify for the loan");
		}

	}

}
