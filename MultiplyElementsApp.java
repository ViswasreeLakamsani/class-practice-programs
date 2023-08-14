//Multiplying Elements

//Grace is exploring multiplication. She wants to find the product of all elements in an array. Write a Java program to help Grace calculate the product of elements in an array.

//Hint:Initialize a variable to store the product. Loop through the array and multiply each element with the product.


package arrayprograms;

import java.util.Scanner;

public class MultiplyElementsApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		MultiplyElements m=new MultiplyElements();
		int res=m.multiply(arr);
		System.out.println("Multi[lication of elements "+res);
		

	}

}
