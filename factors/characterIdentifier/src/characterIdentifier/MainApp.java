package characterIdentifier;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in) ;
		System.out.println("Enter a charcter to find vowel or consonant");
		char ch=scan.next().charAt(0);
		Main.identifyCharacter(ch);
		}
	}


