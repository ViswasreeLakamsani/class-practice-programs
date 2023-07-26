package amstrong;

import java.util.Scanner;

public class AmstrongApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scan.nextInt();
		int original=n;
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		Amstrong am=new Amstrong();
		int res=am.findAmstrong(original,count);
		
		if(original==res) {
			System.out.println("Entered number "+original+" is Amstrong number");
		}
		else {
			System.out.println(" Entered number "+original+" is Not amstrong");
		}

	}

}
