//Counting Odd Numbers

//Ethan is curious about odd numbers. He wants to count the number of odd numbers in a list. Write a Java program to help Ethan count the odd numbers in an array.

//Hint:Loop through the array and for each number, check if it's odd using the modulo operator (%).
package arrayprograms;

import java.util.Scanner;

public class OddNumbersApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		OddNumbers odd=new OddNumbers();
		int res=odd.CountOfOddNumbers(arr);
		System.out.println("count of odd numbers are "+res);
	}

}
