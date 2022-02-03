package chapter4_While_DoWhile_For_Nested_Loops;

import java.util.Scanner;

/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */
public class AddNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean tryagain;

		do {
			System.out.println("Enter the first number");
			double num1 = scanner.nextDouble();

			System.out.println("Enter the second number");
			double num2 = scanner.nextDouble();

			System.out.println("The sum is " + (num1 + num2));

			System.out.println("Would you like to start over: [true] or [false]?");
			tryagain = scanner.nextBoolean();

		} while (tryagain);

		scanner.close();
	}

}
