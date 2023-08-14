//Sum of Positive Numbers

//Emma is working on a personal finance app. She wants to calculate the total income from positive transactions. Write a Java program that takes an array of transaction amounts and 
//calculates the sum of positive amounts.
//Hint: Loop through the array, and if a transaction amount is positive, add it to a sum variable.
package arrayprograms;

import java.util.Scanner;

public class SumOfPositiveAmountApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		SumofPositiveAmount sum=new SumofPositiveAmount();
		int res=sum.findSum(arr);
		System.out.println("The sum of positive amount "+res);
		

	}

}
