package gradecheck;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int grade=scan.nextInt();
		Main.checkGrade(grade);
	}

}
