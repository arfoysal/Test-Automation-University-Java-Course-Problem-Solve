package chapter3_IfElseNestedSwitch_RelationalLogicalOperators;
/*
 * Change For A Dollar Game:
 * The objective of the game is to enter enough change to equal exactly $1!
 * Create a program that asks a user to enter the quantities for the following coins:
 * pennies, nickels, dimes, and quarters. Your program should count up the value of all the change.
 * If it's exactly one dollar then they win the game.
 * If it's more than one dollar, then you need to tell them that it's more than one dollar and how much they went over.
 * If it's less than one dollar, tell them how much they went under.
 * 
 */

import java.util.Scanner;

public class ChangeForADollarGame {

	public static void main(String[] args) {
		// Step 1. Get values for the unknown
		System.out.println("How many pennies would you like?");
		Scanner scanner = new Scanner(System.in);
		int pennies = scanner.nextInt();

		System.out.println("How many nickels would you like?");
		int nickels = scanner.nextInt();

		System.out.println("How many dimes?");
		int dimes = scanner.nextInt();

		System.out.println("How many quarters?");
		int quaters = scanner.nextInt();
		scanner.close();

		// Step 3. Calculate
		int value = pennies + (nickels * 5) + (dimes * 10) + (quaters * 25);
		int oneDollerInCents = 100;

		// Step 4. Make decision for output
		if (value == oneDollerInCents) {
			System.out.println("You win the Game!");
		} else if (value > oneDollerInCents) {
			System.out.println("it's more than one dollar and you went over: " + (value - oneDollerInCents) + " cents");
		} else {
			System.out.println("You went under " + (oneDollerInCents - value) + " cents");
		}
	}

}
