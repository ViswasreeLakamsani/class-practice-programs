//Display all numbers divisible by 3
package simple8Programes;

import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter  a number to print numbers  divisible by 3");
		int n=scan.nextInt();
		divisibleBy3(n);
		
		 

	}
	public static void divisibleBy3(int n) {
		for(int i=0;i<=n;i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
	}
}




	


