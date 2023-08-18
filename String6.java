package stringspractice;

public class String6 {
	public static void main(String[] args) {
		String s1="Rama";
		String s2=s1;
		if(s1==s2) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are unequal");
		}
		if(s1.equals(s2)) {
			System.out.println("Strings are equal"); 
			
		}
		else {
			System.out.println("Strings are unequal");
		}
	}

}
