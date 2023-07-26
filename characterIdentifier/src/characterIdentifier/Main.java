package characterIdentifier;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a character to check for digit or vowel or consonant");
		char ch=scan.next().charAt(0);
		identifyCharacter(ch);
	}
	public static void identifyCharacter(char ch) {
		if(Character.isDigit(ch)) {
			System.out.println("Entered character "+ch+" is Digit..");
			
		}
		else if(!Character.isLetter(ch)) {
			System.out.println("Entered character "+ch+" is special character");
			
		}
		else {
			switch(Character.toLowerCase(ch)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				if(Character.isLowerCase(ch)) {
					System.out.println("Entered character "+ch+" is lower case vowel");
				}
				else {
					System.out.println("Entered character "+ch+" is upper case vowel");

				}
				break;
				default:
					if(Character.isLowerCase(ch)) {
						System.out.println("Entered character "+ch+" is lower case consonant");
				}
					else {
						System.out.println("Entered character "+ch+" is upper case consonant");
				}
					}
			
			}
		}
	}


