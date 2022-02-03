package chapter4_While_DoWhile_For_Nested_Loops;

import java.util.Scanner;

/*
 * LOOP BREAK
 * Search a String to determine if it contains the letter 'A' or 'a'.
 */
public class LetterSearch {

	public static void main(String[] args) {
		// Step 1. Get text
		System.out.println("Enter some text:");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		scanner.close();

		boolean foundStatus = false;

		// Step 2. Search within the text for letter A or a
		for (int i = 0; i < text.length(); i++) {
			char currentLetter = text.charAt(i);
			if (currentLetter == 'A' || currentLetter == 'a') {
				foundStatus = true;
				break;
			}
		}
		
		// step 3. Display the output
		if (foundStatus) {
			System.out.println("This text contains the letter 'A' or 'a");
		} else {
			System.out.println("This text does not contain the letter 'A' or 'a'");
		}

	}

}
