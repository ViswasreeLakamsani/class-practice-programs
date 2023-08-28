package com.kodnest.mutable;

import java.util.Scanner;

public class ReverseOfaString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=new String(scan.nextLine());
		System.out.println("Original String : "+s1);
		char arr1[]=s1.toCharArray();
		char arr2[]=new char[arr1.length];
		int  j=arr1.length-1;
		for(int i=0;i<=arr1.length-1;i++) {
			arr2[j]=arr1[i];
			j--;
			
		}
		s1=new String(arr2);
		  System.out.println("Reversed String: "+s1); 
		
		  
		  
	
		

	}

}
