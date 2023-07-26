package fibonacciseries;

import java.util.Scanner;

public class FibonacciApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scan.nextInt();
		int fib1=0;
		int fib2=1;
		Fibonacci fibo=new Fibonacci();
		fibo.findFibonacci(n,fib1,fib2);
		}

}
