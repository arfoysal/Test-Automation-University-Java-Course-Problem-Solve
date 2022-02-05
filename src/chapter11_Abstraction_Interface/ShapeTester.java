package chapter11_Abstraction_Interface;

public class ShapeTester {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle(12, 17);
        rectangle.print();
        System.out.println(rectangle.calculateArea());

	}

}
