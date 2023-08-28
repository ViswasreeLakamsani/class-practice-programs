package com.kodnest.mutable;

public class Unicode {
	void unicode(String s1) {
		
		for(int i=0;i<=s1.length()-1;i++) {
			int unicode=(int)s1.charAt(i);
			System.out.print(unicode+" ");
			
		}
	}

}
