package gcdoftwonumbers;

import java.util.Scanner;

public class GCDApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers to find GCD");
		int m=scan.nextInt();
		int n=scan.nextInt();
		int res=GCD.findGCD(m,n);
		System.out.println("the gcd of "+m+" and "+n+" is "+res);
		

	}

}
