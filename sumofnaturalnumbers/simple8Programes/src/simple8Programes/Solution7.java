//Display all even numbers divisible by 3
package simple8Programes;

import java.util.Scanner;

public class Solution7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter  a number ");
		int n=scan.nextInt();
		printEvenDivisibleBy3(n);
		
		 

	}
	public static void printEvenDivisibleBy3(int n) {
		for(int i=1;i<=n;i++) {
			if(i%2==0 && i%3==0) {
				System.out.println(i);
			}
		}
	}



		

	



	

}
