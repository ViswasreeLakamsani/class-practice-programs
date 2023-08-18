package stringspractice;

public class Strings2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Rama");
		String s2=new String("Rama");
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
