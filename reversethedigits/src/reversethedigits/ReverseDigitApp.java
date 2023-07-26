package reversethedigits;

import java.util.Scanner;

public class ReverseDigitApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		ReverseDigit rd=new ReverseDigit();
		int res=rd.reverseDigits(n);
		System.out.println(res);
		

	}

}
