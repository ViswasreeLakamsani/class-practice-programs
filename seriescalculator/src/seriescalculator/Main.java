package seriescalculator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		System.out.println(calculateSumOfSeries(n));
	}
	public static double calculateSumOfSeries(int n){
		double s=0.0;
		for(double i=1;i<=n;i++) {
			s=s+1/i;
			
}
		return s;

	
		
		
	}

}


