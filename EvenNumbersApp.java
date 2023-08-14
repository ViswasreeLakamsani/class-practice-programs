//identifying Even Numbers

//Bob has a list of numbers, and he wants to know how many of them are even. Write a Java program to count the number of even numbers in an array.

//Hint: Loop through the array and for each number, check if it's even using the modulo operator (%).
package arrayprograms;

import java.util.Scanner;

public class EvenNumbersApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		EvenNumber even=new EvenNumber();
		int res=even.countOfEvenNumbers(arr);
		System.out.println("The count of even numbers are "+res);

	}

}
