package chapter9_Inheritance_Overriding_Overloading_AccessLimitation;

public class Cake {
	protected String flavor;
	protected double price;

	public Cake(String flavor){
        setFlavor(flavor);
        setPrice(22.99);
    }
	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
