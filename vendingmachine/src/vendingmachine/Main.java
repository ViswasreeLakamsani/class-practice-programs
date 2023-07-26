package vendingmachine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter product code");
		String code=scan.next();
		getProduct(code);
	}
	public static void getProduct(String productCode) {
		switch(productCode) {
		case "p01":
			System.out.println("Coco cola");
			break;
		case "p02":
			System.out.println("Pepsi");
			break;
		case "p03":
			System.out.println("Sprite");
			break;
			default:
				System.out.println("Jira water");
		}
		
	}

}
