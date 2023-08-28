package com.kodnest.mutable;

public class Count {
	void count(String s1) {
		int upper=0;
		int lower=0;
		for(int i=0;i<=s1.length()-1;i++) {
			char ch=s1.charAt(i);
			if(ch>=97 && ch<=122) {
				lower++;
			}
			else  {
				upper++;
			}
			
		}
		
		System.out.println("count of upper case letters: "+upper);
		System.out.println("Count of lower case letters: "+lower);
	}

	
}
