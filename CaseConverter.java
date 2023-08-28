package com.kodnest.mutable;

public class CaseConverter {
	String convert(String str) {
		StringBuilder result=new StringBuilder();
		for(char c:str.toCharArray()) {
			if(Character.isUpperCase(c)) {
				result.append(Character.toLowerCase(c));
				
			}
			else if
				(Character.isLowerCase(c)) {
				result.append(Character.toUpperCase(c));
			}
			else {
				result.append(c);
			}
		
		}
		return result.toString();
		
		
		
	}

}
