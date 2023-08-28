package com.kodnest.mutable;

import java.util.Scanner;

public class ConcatinationApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1 string");
		String s1=new String(scan.nextLine());
		System.out.println("Enter 2 string");
		String s2=new String(scan.nextLine());
		Concatination c=new Concatination();
		String res=c.concate(s1,s2);
		if(res!=null) {
			System.out.println("Concatinated string is "+res); 
			
		}
		else {
			System.out.println("String are not same to concate");
		}
		

	}

}
