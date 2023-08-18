package arrayprograms;

import java.util.Scanner;

public class NegativeArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 System.out.println("Enter array length");
			int arr[]=new int[scan.nextInt()];
			System.out.println("Enter "+arr.length+" Number of element");
			for(int i=0;i<=arr.length-1;i++) {
				arr[i]=scan.nextInt();
			}
			System.out.println("Array elements before replacing negative numbers with zero");
			for(int x:arr) {
				System.out.print(x+" ");
			}
			Replace r=new Replace();
			r.arrayReplace(arr);
			System.out.println();
			System.out.println("Array elements after replacing negative numbers with zero");
			for(int x:arr) {
				System.out.print(x+" ");
			}
	}
}

				
			
			

	
			


