package stringspractice;

public class Strings4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Rama";
		String s2="Sita";
		String s3="Rama"+"Sita";
		String s4="Rama"+"Sita";
		if(s3==s4){
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are unequal");
		}
		if(s3.equals(s4)) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are unequal");
		}


	}

}
