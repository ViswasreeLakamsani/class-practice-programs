
// Display all numbers divisible by 2
package simple8Programes;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter  a number to print numbers is divisible by 2 or not");
		int n=scan.nextInt();
		divisibleBy2(n);
		
		 

	}
	public static void divisibleBy2(int n) {
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
