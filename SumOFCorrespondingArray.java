package arrayprograms;

import java.util.Scanner;

public class SumOFCorrespondingArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 System.out.println("Enter array length");
			int arr1[]=new int[scan.nextInt()];
			System.out.println("Enter "+arr1.length+" Number of element");
			for(int i=0;i<=arr1.length-1;i++) {
				arr1[i]=scan.nextInt();
				
			}
			
			
			int arr2[]=new int[arr1.length];
			System.out.println("Enter "+arr2.length+" Number of element");
			for(int i=0;i<=arr2.length-1;i++) {
				arr2[i]=scan.nextInt();
				
			}
			Sum sum=new Sum();
			int arr3[]=sum.sumArray(arr1,arr2);
			for(int i=0;i<=arr3.length-1;i++) {
				System.out.print(arr3[i]+" ");
				
			}
			
			
		
	}

	}


