//Calculating Factorial

//Ian is learning about factorials. He wants to calculate the factorial of a given number. Write a Java program to help Ian calculate the factorial of a number.

//Hint:Initialize a variable to store the factorial. Loop from 1 to the given number and multiply each iteration's value with the factorial.




package arrayprograms;

import java.util.Scanner;

public class FactorialApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		
		Factorial f=new Factorial();
		int res=f.factorial(num);
		System.out.println("Factorial of given number "+res);
		

	}

}
