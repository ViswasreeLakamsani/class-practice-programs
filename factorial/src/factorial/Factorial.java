package factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scan.nextInt();
	    int fact=1;
	    for(int i=1;i<=n;i++) {
	    	fact=fact*i;
	    	
	    }
	    System.out.println("Factorial of "+n+" is "+fact);
	    

	}

}
