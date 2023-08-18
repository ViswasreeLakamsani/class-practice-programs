package arrayprograms;

import java.util.Scanner;

public class BinarySearchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" number of elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter key");
		int key=scan.nextInt();
		BinarySearch bs=new BinarySearch();
		int res=bs.search(arr,key);
		if(res>0) {
			System.out.println("Key found");
		}
		else {
			System.out.println("Key not found");
		}

	}

}
