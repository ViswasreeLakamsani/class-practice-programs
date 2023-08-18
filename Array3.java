package arrayprograms;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in) ;
		 System.out.println("Enter length of the array");
			 int arr[]=new int[scan.nextInt()];
			 for(int i=0;i<=arr.length-1;i++) {
				 arr[i]=scan.nextInt();
				 
		 }
			 System.out.println("Array contents are");
			 for(int u:arr) {
				 if(u>0) {
					 System.out.println(u+" ");
				 }
			 }
		
		
			
		

	}

}
