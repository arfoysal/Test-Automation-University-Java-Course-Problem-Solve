package chapter3_IfElseNestedSwitch_RelationalLogicalOperators;

import java.util.Scanner;

/*
 * LOGICAL OPERATORS: Logical operators are used to combine two separate conditions 
 * in order to get one resulting boolean value.
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */
public class LogicalOperatorLoanQualifier {

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
		if (actualSalary >= requiredSalary && actualYearsEmployed >= requiredYearsEmployed) {
			System.out.println("Congrats! You qualify for the loan");
		} else {
			System.out.println("Sorry, you must earn at least $" + requiredSalary + " to qualify for the loan");
		}

	}

}
