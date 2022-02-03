package chapter4_While_DoWhile_For_Nested_Loops;

import java.util.Scanner;

/*
 * NESTED LOOPS:
 * Find the average of each student's test scores
 */
public class AverageTestScores {

	public static void main(String[] args) {
		// Step 1. Get data for number of students and courses
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of students.");
		int numberOfStudents = scanner.nextInt();
		System.out.println("Enter the number of Tests.");
		int numberOfTests = scanner.nextInt();

		// Step 2. Process all students
		for (int i = 0; i < numberOfStudents; i++) {
			double total = 0;
			for (int j = 0; j < numberOfTests; j++) {
				System.out.println("Enter the score for Test #" + (j + 1));
				double score = scanner.nextDouble();
				total = total + score;
			}
			double average = total / numberOfTests;
			System.out.println("The test average for student #" + (i + 1) + " is " + average);
		}
		scanner.close();
	}

}
