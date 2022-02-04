package chapter7_Arrays;

import java.util.Scanner;

public class DayOfTheWeek {

	public static void main(String[] args) {
		String week[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number for the day of the week");
		int dayNumber = scanner.nextInt() - 1;
		scanner.close();

		System.out.println("Corresponding day: " + week[dayNumber]);
	}

}
