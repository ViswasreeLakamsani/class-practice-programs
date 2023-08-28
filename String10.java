package stringspractice;

public class String10 {

	public static void main(String[] args) {
		String s1="Sachin";
		String s2="Saurav";
		
		if(s1.compareTo(s2)>0) {
			System.out.println("String1 is greater than string2");
		}
		else if(s1.compareTo(s2)<0) {
			System.out.println("String2 is greater than string1");
		}
		else {
			System.out.println("Strings are equal");
		}

	}

}
