package chapter2_Java_Fundamentals;

import java.util.Scanner;

public class GrossPayCalculator {

	public static void main(String[] args) {
		// Step 1. Get the number of hours worked
		System.out.println("Enter the numver of hours the employee worked.");
		Scanner scanner = new Scanner(System.in);
		int hours = scanner.nextInt();

		// Step 2. Get the hourly pay rate
		System.out.println("Enter the employee's pay rate.");
		double rate = scanner.nextInt();
		scanner.close();

		// Step 3. Multiply hours and pay rate
		double grossPay = hours * rate;

		// Step 4. Display result
		System.out.println("The employee's pay is $" + grossPay);

	}

}
