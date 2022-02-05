package chapter10_Polymorphism;

public class Fruit {
	protected double calories;

	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}
	
	public void makeJuice() {
		System.out.println("Juice is made");
	}
	
}
