package patternlevel4;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
				
			}
			for(int j=5;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}