package chapter11_Abstraction_Interface;

public class Customer {

	public static void main(String[] args) {
		Product book = new Book();
		book.setPrice(19.29);
		System.out.println(book.getPrice());
	}
}
