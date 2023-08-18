package arrayprograms;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
	
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter array length");
			int arr[]=new int[scan.nextInt()];
			System.out.println("Enter "+arr.length+" Number of element");
			for(int i=0;i<=arr.length-1;i++) {
				arr[i]=scan.nextInt();
				
			}
			System.out.println("Enter the key to search");
			int key=scan.nextInt();
		     Search ls=new Search();
			boolean res=ls.isPresent(arr,key);
			if(res==true) {
				System.out.println("Key found At the Inder "+res);
			}
			else {
				System.out.println("Key not found");
			}
			
			
			}
			


	}


