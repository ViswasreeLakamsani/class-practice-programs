package com.kodnest.mutable;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=new String(scan.nextLine());
		System.out.println("Original String : "+s1);
		PalindromeApp p=new PalindromeApp();
		boolean res=p.isPalindrome(s1);
		if(res==true) {
			System.out.println("Given String is Palindrome");
		}
		else {
			System.out.println("Given String is not Palindrome");
			
		}
		  
		
		

	}

}
