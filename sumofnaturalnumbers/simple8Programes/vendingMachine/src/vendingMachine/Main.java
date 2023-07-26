package vendingMachine;

public class Main {
	public static void getProduct(String productCode) {
		switch(productCode) {
		case "p01":
			System.out.println("cococola");
			break;
		case "p02": 
		System.out.println("sprite");
		break;
		
		case "p03":
			System.out.println("pepsi");
			break;
			default:
				System.out.println("any drink");
	}
	}

}
