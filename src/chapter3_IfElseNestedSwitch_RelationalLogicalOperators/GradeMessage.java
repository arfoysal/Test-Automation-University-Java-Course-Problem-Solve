package chapter3_IfElseNestedSwitch_RelationalLogicalOperators;

import java.util.Scanner;

/*
 * SWITCH - the switch statement checks for equality.
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */
public class GradeMessage {

	public static void main(String[] args) {
		// Step 1. Get the test grade
		System.out.println("Enter your letter grade:");
		Scanner scanner = new Scanner(System.in);
		String grade = scanner.next();
		scanner.close();

		// Step 2. Determine the Massage for the grade
		String message;

		switch (grade) {
			case "A":
				message = "Excellent job!";
				break;
			case "B":
				message = "Great job!";
				break;
			case "C":
				message = "Good job!";
				break;
			case "D":
				message = "You need to work a bit harder";
				break;
			case "F":
				message = "Uh oh!";
				break;
			default:
				message = "Error. Invalid grade";
				break;
		}
		// Step 3. Display Message
		System.out.println(message);

	}

}
