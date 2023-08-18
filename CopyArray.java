package arrayprograms;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter array length");
	    
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Number of element");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
			
		}
		System.out.println("array arr contents are: ");
		for (int  i : arr) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		System.out.println("array b contents are: ");
		int b[]=new int[arr.length];
		for(int i=0;i<=arr.length-1;i++) {
			b[i]=arr[i];
			System.out.print(b[i]+" ");
		}

	}

}
