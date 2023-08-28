package com.kodnest.mutable;

public class String2 {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer();
		System.out.println(sb1.capacity());
		sb1.append("Sachin Is a BatsMan");
		System.out.println(sb1.capacity());
		sb1.append("He lives in mumbai");
		System.out.println(sb1.capacity());
		System.out.println("=====================");
		StringBuilder strb=new StringBuilder();
		System.out.println(strb.capacity());
		strb.append("Saurav is a BatsMan");
		System.out.println(strb.capacity());
		strb.append("He lives in mumbai");
		System.out.println(strb.capacity());

	}

}
