package chapter11_Abstraction_Interface;

public class Farm {

	public static void main(String[] args) {
		Animal donald = new Duck();
		donald.makeSound();

		Duck daffy = new Duck();
		daffy.makeSound();

		Cow zed = new Cow();
		zed.makeSound();
	}
}
