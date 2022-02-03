package chapter4_While_DoWhile_For_Nested_Loops;

import java.util.Random;

/*
 * The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
 * Roll the die for the user (generate a Random number between 1 – 6) and 
 * advance the user that number of spaces on the game board.
 * After each roll, tell the user which game space they are on 
 * and how many more spaces they have to go to win.
 * Repeat this 4 additional times, for 5 rolls in total.
 * However, if the user gets to 20 before 5 rolls, end the game - they’ve won.
 * If they are greater than or less than 20 spaces exactly, they lose.
 * Remember there are only 20 spaces on the board, 
 * so a message like “You advanced to space 22” is a bug.
 */
public class RollTheDieGame {

	public static void main(String[] args) {
		int maximumRolls = 5;
		int maximumSpaces = 20;
		int currentSpacePosition = 0;
		Random random = new Random();

		System.out.println("Welcome to Roll the Die! Let's begin.....");

		for (int i = 0; i < maximumRolls; i++) {
			int die = random.nextInt(6) + 1;
			currentSpacePosition += die;
			System.out.print(String.format("Roll #%d: You've rolled a %d. ", (i + 1), die));

			if (currentSpacePosition > maximumSpaces) {
				System.out.print("Unfortunately, that takes you past " + maximumSpaces + " spaces. You lose!");
				break;
			} else if (currentSpacePosition == maximumSpaces) {
				System.out.print("You're on space " + currentSpacePosition + ". Congrats, you win!");
				break;
			} else if ((i + 1) == maximumRolls && currentSpacePosition < maximumSpaces) {
				System.out.println("You're on space " + currentSpacePosition + ".");
				System.out.println("Unfortunately, you didn't make it to all " + maximumSpaces + " spaces. You lose!");
			} else {
				int spacesRemains = maximumSpaces - currentSpacePosition;
				System.out.print(
						"You are now on space " + currentSpacePosition + " and have " + spacesRemains + " more to go.");
			}
			System.out.println();
			System.out.println();
		}

	}

}
