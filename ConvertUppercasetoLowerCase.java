package com.kodnest.mutable;

import java.util.Scanner;

public class ConvertUppercasetoLowerCase {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String");
		String s1=new String(scan.nextLine());
		UpperToLowerConversion c=new UpperToLowerConversion();
		c.convert(s1);

	}

}
