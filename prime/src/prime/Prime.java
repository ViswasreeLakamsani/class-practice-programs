package prime;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to check for prime");
		int n=scan.nextInt();
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println("Number "+n+" is not prime");
				return;
			}
			
		}
		System.out.println("Entered number "+n+" is prime");
		}
		

	}


