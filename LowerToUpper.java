package com.kodnest.mutable;

import java.util.Scanner;

public class LowerToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String");
		String s1=new String(scan.nextLine());
		LowerUpperConversion c=new LowerUpperConversion();
		c.convert(s1);
				
	}

}
