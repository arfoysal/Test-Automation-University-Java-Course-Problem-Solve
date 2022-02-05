package chapter9_Inheritance_Overriding_Overloading_AccessLimitation;

public class Square extends Rectangle {
	@Override
	public double calculatePerimeter() {
		return sides * length;
	}

	public void print(String text) {
		System.out.println("I am a " + text);

	}
}
