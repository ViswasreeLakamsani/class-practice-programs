//Finding Prime Numbers

//Hannah is fascinated by prime numbers. She wants to identify the prime numbers in a list. Write a Java program to help Hannah find the prime numbers in an array.

//Hint:Loop through the array and for each number, check if it's prime. A prime number has no divisors other than 1 and itself.


package arrayprograms;

import java.util.Scanner;

public class PrimeNumberApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		PrimeNumber prime=new PrimeNumber();
		prime.prime(arr);
		for(int x:arr) {
			System.out.println(x+" ");
		}
		
		

	}

}
