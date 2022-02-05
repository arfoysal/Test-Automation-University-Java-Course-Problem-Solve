package chapter10_Polymorphism;

public class Orange extends Fruit {
	public Orange() {
		setCalories(85);
	}

	@Override
	public void makeJuice() {
		System.out.println("Orange juice is my favorite");
	}

	public void selectColor() {
		System.out.println("Orange Color is selected");
	}

}
