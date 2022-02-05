package chapter10_Polymorphism;

public class Market {

	public static void main(String[] args) {
		Fruit orange = new Orange();
		((Orange) orange).selectColor();

		Orange orange2 = new Orange();
		orange2.selectColor();

		Fruit lemon = new Lemon();
		((Lemon) lemon).mixWithIce();

		Lemon lemon2 = new Lemon();
		lemon2.mixWithIce();
		Fruit banana = new Fruit();

		squeeze(orange);
		squeeze(orange2);
		squeeze(lemon);
		squeeze(lemon2);
		squeeze(banana);

	}

	public static void squeeze(Fruit fruit) {
		System.out.println("Squeezing....");
		fruit.makeJuice();

	}

}
