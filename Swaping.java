package arrayprograms;

import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in) ;
			System.out.println("Enter array length");
			int arr[]=new int[scan.nextInt()];
			for(int i=0;i<=arr.length-1;i++) {
				arr[i]=scan.nextInt();
				}
			System.out.println("Enter indexes");
			int c=scan.nextInt();
			int d=scan.nextInt();
		    for(int i=0;i<=arr.length-1;i++) {
			int help;
			help=arr[c];
			arr[c]=arr[d];
			arr[d]=help;
			for(int j=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
			

	}
		    }

	}
}
