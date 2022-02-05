package chapter10_Polymorphism;

/*
 * Polymorphism:
 * Polymorphism is the ability to take multiple forms. 
 * Specifically, in object-oriented programming, 
 * polymorphism is where a subclass can define their own unique behaviors, 
 * and yet share some of the same behaviors of their superclass.
 */
public class Zoo {

	public static void main(String[] args) {
		Dog rocky = new Dog();
		rocky.fetch();
		rocky.makeSound(); // If a method is overwritten by the subclass, the polymorphic object will
							// execute the overwritten method at runtime.
		feed(rocky);

		Animal sasha = new Dog(); // An object can have a superclass type and a subclass instance.
		sasha.makeSound();
		feed(sasha);

		sasha = new Cat();
		sasha.makeSound();
		((Cat) sasha).scratch(); // Polymorphic objects can only access the methods of their type, not of their
									// instance, unless you use casting.
		feed(sasha);
	}

	public static void feed(Animal animal) {

		if (animal instanceof Dog) { // The instanceof operator is used to determine if an object is an instance of a
										// certain class.
			System.out.println("here's your dog food");
		}

		else if (animal instanceof Cat) {
			System.out.println("here's your cat food");
		}

	}

}
