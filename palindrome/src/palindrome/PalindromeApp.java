package palindrome;

import java.util.Scanner;


public class PalindromeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a number");
			int n=scan.nextInt();
			Palindrome p=new Palindrome();
			int res=p.findPalindrome(n);
			
			if(n==res) {
				System.out.println("Entered number "+n+" is palindrome");
			}
			else {
				System.out.println("Entered number "+n+" is not palindrome");
			}
			

	}

}
