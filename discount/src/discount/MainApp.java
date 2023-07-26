package discount;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Amount");
		double purchaseAmount=scan.nextDouble();
		Main.checkDiscount(purchaseAmount);

	}

}
