package com.kodnest.mutable;

import java.util.Scanner;

public class CountApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string");
		String s1=scan.nextLine();
		Count c=new Count();
		c.count(s1);
		
	}

}
