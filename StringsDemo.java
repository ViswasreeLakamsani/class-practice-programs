package com.kodnest.mutable;

import java.util.Scanner;

public class StringsDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		char[] arr1=new char[scan.nextInt()];
		System.out.println("Enter "+arr1.length+" elements");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scan.next().charAt(0);
		}
		System.out.print("arr1-->");
		for(char c:arr1) {
			System.out.print(c+" ");
		}
		System.out.println();
		char []arr2=new char[arr1.length];
		for(int i=0;i<=arr1.length-1;i++) {
			arr2[i]=arr1[i];
		}
		System.out.print("arr2-->");
		for(char c:arr2) {
			System.out.print(c+" "); 
			
		}
		System.out.println();
		char[] arr3=new char[arr2.length];
		int j=arr3.length-1;
		for(int i=0;i<=arr2.length-1;i++) {
			arr3[j]=arr2[i];
			j--;
		}
		System.out.print("arr3-->");
		for(char c:arr3) {
			System.out.print(c+" ");
			
		}
		
		
		
	}

}
