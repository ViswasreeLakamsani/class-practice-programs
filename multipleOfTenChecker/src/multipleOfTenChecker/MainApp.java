package multipleOfTenChecker;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		int m=scan.nextInt();
		Main.checkMultipleOfTen(n,m);

	}

}
