package vendingMachine;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	   System.out.println("Enter productcode");
	   String productCode=scan.next();
	   Main.getProduct(productCode);
	

		}
		
	}


