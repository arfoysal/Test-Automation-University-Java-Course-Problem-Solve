package chapter6_Objects_Classes_Overloading;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

	private Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {

		HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
		Rectangle kitchen = calculator.getRoomSize();
		Rectangle bathroom = calculator.getRoomSize();
		calculator.scanner.close();
		double area = calculator.calculateTotalArea(kitchen, bathroom);
		System.out.println("The total area is: " + area);
	}

	public Rectangle getRoomSize() {

		System.out.println("Enter the length of your room:");
		double length = scanner.nextDouble();

		System.out.println("Enter the width of your room:");
		double width = scanner.nextDouble();

		return new Rectangle(length, width);
	}
	public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
		return rectangle1.calculateArea() + rectangle2.calculateArea();

	}

}
