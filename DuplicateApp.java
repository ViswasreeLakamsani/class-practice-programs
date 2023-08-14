//Olivia wants to ensure there are no duplicate elements in a list. Write a Java program to help Olivia check if an array contains any duplicate elements.

//Hint: Use nested loops to compare each element with every other element. If two elements are the same, indicate that duplicates are present.


package arrayprograms;

import java.util.Scanner;

public class DuplicateApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
			
		}
		Duplicate d=new Duplicate();
		boolean res=d.duplicate(arr);
		if(res==true) {
			System.out.println("Duplicates are present in the given array");
		}
		else {
			System.out.println("Duplicates are not present in the array");
		}

	}

}
