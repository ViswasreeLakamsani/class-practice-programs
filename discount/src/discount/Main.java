package discount;

public class Main {
	public static void checkDiscount(double purchaseAmount) {
		if(purchaseAmount>100) {
			System.out.println("Discount Applicable");
		}
		else {
			System.out.println("Discount not applicable");
		}
	}

}
