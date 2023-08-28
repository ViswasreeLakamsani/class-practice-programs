package com.kodnest.mutable;

public class MutableString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Rama");
		System.out.println(sb);
		sb.append("sita");
		System.out.println(sb);
		
		
		
		StringBuilder strb=new StringBuilder("Ravana");
		System.out.println(strb);
		strb.append("Mandodari");
		System.out.println(strb);

	}

}
