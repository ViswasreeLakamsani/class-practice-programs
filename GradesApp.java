//Counting Grades

//The teacher wants to analyze the grades of a class. Write a Java program that takes an array of student grades (ranging from 0 to 100) and counts how many students scored above 75.

//Hint :Use a loop to iterate through the array. For each grade, check if it's above 75 and increment a counter accordingly.


package arrayprograms;

import java.util.Scanner;

public class GradesApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements in the range of 0 to 100");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		Grades g=new Grades();
		int res=g.grade(arr);
		System.out.println("The count of students who scored more than 75 marks is "+res);
		

	}

}
