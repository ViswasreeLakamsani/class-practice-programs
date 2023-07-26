package polygon;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter side");
    int sides=scan.nextInt();
    Main.identifyPolygon(sides);
	}

}
