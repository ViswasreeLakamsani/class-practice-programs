package characterIdentifier;

public class Main {
	public static void identifyCharacter(char ch)

	{
		if(Character.isDigit(ch)) {
			System.out.println("Entered character "+ch+" is digit");
		}
		else if(Character.isLetter(ch)==false) {
			System.out.println("Enter character "+ch+" is special character");
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




