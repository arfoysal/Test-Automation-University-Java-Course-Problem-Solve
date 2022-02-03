package chapter3_IfElseNestedSwitch_RelationalLogicalOperators;

import java.util.Scanner;

/*
 * IF-ELSE-IF
 * If situation A occurs, do something.
 * Else if situation B occurs, do something else.
 * Else if situation C occurs, do something else.
 * Display the letter grade for a student based on their test score.
 */
public class TestResults {

	public static void main(String[] args) {
		// Step 1. Get the test score
		System.out.println("Enter your test score:");
		Scanner scanner = new Scanner(System.in);
		double score = scanner.nextDouble();
		scanner.close();

		// Step 2.Determine the letter grade
		char grade;

		if (score < 60) {
			grade = 'F';
		} else if (score < 70) {
			grade = 'D';
		} else if (score < 80) {
			grade = 'C';
		} else if (score < 90) {
			grade = 'B';
		} else {
			grade = 'A';
		}

		System.out.println("Your grade is " + grade);

	}

}
