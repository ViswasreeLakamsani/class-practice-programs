package com.kodnest.mutable;

import java.util.Scanner;

public class CaseConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=new String(scan.nextLine());
		CaseConverter c=new CaseConverter();
		String converted=c.convert( str);
		System.out.println("Converted string: "+converted);

	}

}
