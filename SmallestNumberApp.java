// Finding the Smallest Number

//Alice is playing a game where she's given a list of numbers and she needs to find the smallest number. 
//Write a Java program to help Alice find the smallest number in an array.

//Hint: Initialize a variable to store the smallest number, then iterate through the array and update 
//the variable if a smaller number is found.
package arrayprograms;

import java.util.Scanner;

public class SmallestNumberApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+ arr.length+" elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		SmallestNumber sn=new SmallestNumber();
		sn.findSmallestNumber(arr);

	}

}
