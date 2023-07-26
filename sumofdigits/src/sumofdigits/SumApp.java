package sumofdigits;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scan.nextInt();
		int sum=0;
		Sum summ=new Sum();
		int res=summ.findSum(n,sum);
		System.out.println(res);
		

	}

}
