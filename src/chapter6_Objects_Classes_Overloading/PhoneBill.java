package chapter6_Objects_Classes_Overloading;

public class PhoneBill {
	private int id, allottedMinites, usedMinutes;
	private double baseRate;

	public PhoneBill() {
		id = 0;
		baseRate = 59.99;
		allottedMinites = 600;
		usedMinutes = 600;
	}

	public PhoneBill(int id) {
		this.id = id;
		baseRate = 59.99;
		allottedMinites = 600;
		usedMinutes = 600;
	}

	public PhoneBill(int id, double baseRate, int allottedMinites, int usedMinutes) {
		this.id = id;
		this.baseRate = baseRate;
		this.allottedMinites = allottedMinites;
		this.usedMinutes = usedMinutes;
	}

	public void calculateNPrintBill() {
		double finalTotal = baseRate + overageFees() + calculateTax();
		System.out.println("Phone Bill Statement");
		System.out.println("ID: " + id);
		System.out.println("Base Rate: $" + String.format("%.2f", baseRate));
		System.out.println("Overage Fee: $" + String.format("%.2f", overageFees()));
		System.out.println("Tax: $" + String.format("%.2f", calculateTax()));
		System.out.println("Total: $" + String.format("%.2f", finalTotal));

	}

	public double calculateTax() {
		double taxPercentage = 0.15;
		return taxPercentage * (baseRate + overageFees());
	}

	public double overageFees() {
		if (usedMinutes <= allottedMinites) {
			return 0;
		}
		double overageRate = 0.25;
		double OverageMinites = usedMinutes - allottedMinites;
		return OverageMinites * overageRate;
	}

}
