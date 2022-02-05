package chapter11_Abstraction_Interface;

public interface Product {
	int size = 0;

	double getPrice();

	void setPrice(double price);

	String getName();

	void setName(String name);

	String getColor();

	void setColor(String color);

	default String getBarcode() {
		return "no barcode";
	}
}
