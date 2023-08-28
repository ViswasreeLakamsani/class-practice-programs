package stringspractice;

public class String8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Viswasree");
		String s2=new String("VISWASREE");
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
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are unequal");
		}
		}
			
		

	}


