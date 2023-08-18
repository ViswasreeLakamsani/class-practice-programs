package arrayprograms;

import java.util.Scanner;

public class InsertionSortApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" of elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Array contents before sorting");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		InsertionSort is=new InsertionSort();
		is.sorting(arr);
		System.out.println("Array contents after sorting");
		for(int x:arr) {
			System.out.print(x+" ");
			
		}

	}

}
