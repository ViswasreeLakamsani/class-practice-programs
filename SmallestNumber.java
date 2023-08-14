package arrayprograms;

public class SmallestNumber {
	void findSmallestNumber(int arr[]) {
		int smallest=arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println("The smallest number is "+smallest);
	}

}
