package arrayprograms;

import java.util.Scanner;

public class MergeArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		 System.out.println("Enter array1 length");
			int arr1[]=new int[scan.nextInt()];
			System.out.println("Enter "+arr1.length+" Number of element");
			for(int i=0;i<=arr1.length-1;i++) {
				arr1[i]=scan.nextInt();
				
			}
			System.out.println("Enter array2 length");
			int arr2[]=new int[scan.nextInt()];
			System.out.println("Enter "+arr2.length+" Number of element");
			for(int i=0;i<=arr2.length-1;i++) {
				arr2[i]=scan.nextInt();
				
			}
			System.out.print("Array-1===>");
			for(int x:arr1) {
				System.out.print(x+" ");
			}
			System.out.print("Array-2===>");
			for(int x:arr2) {
				System.out.print(x+" ");
			}
			System.out.println();
			MergeArray ma=new MergeArray();
			int res[]=ma.mergeArray(arr1,arr2);
			System.out.println("Array-3===>");
			for(int x:res) {
				System.out.print(x+" ");
			}
			
		
	}

}
