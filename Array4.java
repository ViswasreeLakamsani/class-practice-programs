package arrayprograms;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		PrintArray pa=new PrintArray();
		pa.printArray(arr);
		
			
		}

	}


