package chapter9_Inheritance_Overriding_Overloading_AccessLimitation;

public class TasteTester {

	public static void main(String[] args) {
		Cake cake = new Cake("chocolate");
		cake.setPrice(39.64);
		System.out.println("Cake flavor: " + cake.getFlavor());
		System.out.println("Cake price: " + cake.getPrice());

		BirthdayCake birthdayCake = new BirthdayCake();
		birthdayCake.setPrice(24.66);
		System.out.println("Birthday cake flavor: " + birthdayCake.getFlavor());
		System.out.println("Birthday cake price: " + birthdayCake.getPrice());

		WeddingCake weddingCake = new WeddingCake();
		weddingCake.setFlavor("pina colada");
		System.out.println("Wedding cake flavor: " + weddingCake.getFlavor());
		System.out.println("Wedding cake price: " + weddingCake.getPrice());
	}

}
