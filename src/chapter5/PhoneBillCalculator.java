package chapter5;

import java.util.Scanner;

/*
 * Phone Bill Calculator
 * Calculate the final total of someone's cell phone bill.
 * Allow the operator to input the plan fee and the number of overage minutes.
 * Charge the user 0.25 for every minute they were over their plan, and 15% tax on the sub-total.
 * Create separate methods to calculate the tax, overage fees, and final total.
 * Print the itemized bill.
 */
public class PhoneBillCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter base cost of the plan:");
		double baseCost = scanner.nextDouble();

		System.out.println("Enter overage minutes:");
		int overageMinutes = scanner.nextInt();
		scanner.close();

		double totalOverageCost = overageFees(overageMinutes);
		double totalTax = calculateTax(baseCost + totalOverageCost);
		calculateNPrintBill(baseCost, totalOverageCost, totalTax);

	}

	private static void calculateNPrintBill(double baseCost, double totalOverageCost, double totalTax) {
		double finalTotal = baseCost + totalOverageCost + totalTax;
		System.out.println("Phone Bill Statement");
		System.out.println("Plan: $" + String.format("%.2f", baseCost));
		System.out.println("Overage: $" + String.format("%.2f", totalOverageCost));
		System.out.println("Tax: $" + String.format("%.2f", totalTax));
		System.out.println("Total: $" + String.format("%.2f", finalTotal));

	}

	private static double calculateTax(double subtoal) {
		double taxPercentage = 0.15;
		double totalTax = subtoal * taxPercentage;
		return totalTax;
	}

	private static double overageFees(int overageMinutes) {
		double overageRate = 0.25;
		double totalIverageFees = overageRate * overageMinutes;
		return totalIverageFees;
	}

}
