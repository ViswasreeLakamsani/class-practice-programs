package com.kodnest.mutable;

import java.util.Scanner;

public class LengthOfStringApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first String");
		String s1=new String(scan.nextLine());
		System.out.println("Enter second string");
		String s2=new String(scan.nextLine());
		Length l=new Length();
		l.lengthchecker(s1, s2);
		
		

	}

}
