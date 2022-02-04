package chapter6_Objects_Classes_Overloading;

public class PhoneBillCalculator {

	public static void main(String[] args) {
		PhoneBill billById = new PhoneBill(1234);
		billById.calculateNPrintBill();
		
		PhoneBill bill = new PhoneBill(12, 90.99, 1000, 1200);
		bill.calculateNPrintBill();

	}

}
