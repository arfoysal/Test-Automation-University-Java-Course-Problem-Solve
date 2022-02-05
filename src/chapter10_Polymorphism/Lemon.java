package chapter10_Polymorphism;

public class Lemon extends Fruit {
	public Lemon() {
		setCalories(55);
	}

	@Override
	public void makeJuice() {
		System.out.println("Lamaned is best");
	}

	public void mixWithIce() {
		System.out.println("Lamon mixed with cold ice");
	}
}
