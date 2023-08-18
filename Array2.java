package arrayprograms;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter length of the array");
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
			
		}
		System.out.println("Array contents are...");
		for(int u:arr) {
			System.out.print(u+5+" ");
		}

	}

	}


