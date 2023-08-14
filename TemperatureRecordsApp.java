//A weather station records the daily temperatures for a week. 
//Write a Java program that takes an array of temperatures and calculates the average temperature.
//Hint :Sum up all temperatures using a loop, then divide the sum by the number of 
//temperatures to find the average.
package arrayprograms;

import java.util.Scanner;

public class TemperatureRecordsApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements");
		for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scan.nextInt();
		}
		TemperatureRecords tr=new TemperatureRecords();
		int res=tr.findSum(arr);
		System.out.println("average of temperatures "+res);
		
		
	}
}


