package chapter9_Inheritance_Overriding_Overloading_AccessLimitation;

public class InheritanceTester {

	public static void main(String[] args) {
		testConstructors();
		testSquareOverride();
		testSquareOverloading();
		testChainInheritance();

	}

	public static void testConstructors() {
		// Person person = new Person();
		Employee employee = new Employee();
		employee.setName("Kathy");
		// person.setAge(26);
	}

	public static void testSquareOverride() {
		Rectangle rectangle = new Rectangle();
		rectangle.setLength(4);
		rectangle.setWidth(8);
		System.out.println(rectangle.calculatePerimeter());

		Square square = new Square();
		square.setLength(4);
		square.setWidth(8);
		System.out.println(square.calculatePerimeter());
	}

	public static void testSquareOverloading() {
		Rectangle rectangle = new Rectangle();
		rectangle.print();
		Square square = new Square();
		square.print();
		square.print("Square");
	}

	public static void testChainInheritance() {
		Mother mom = new Mother();
		mom.setName("Jossy");
		System.out.println(mom.getName() + " is a " + mom.getGender());
	}

}
