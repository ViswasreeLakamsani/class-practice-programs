//Write a java program to print the numbers according to the below requirement from 1 to n, where n > 100.


package simple8Programes;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number greater than 100");
		int n=scan.nextInt();
		if(n>100) 
		{
			printNumbers(n);
		}
		else {
			System.out.println("Please rerun and enter a number greater than 100");
		}
		}
		public static void printNumbers(int n){
			for(int i=0;i<=n;i++) {
				System.out.println(i);
			}
		}

	}


