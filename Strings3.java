package stringspractice;

public class Strings3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Rama";
		String s2="Rama";
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
