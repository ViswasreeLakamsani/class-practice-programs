package arrayprograms;

public class SumofPositiveAmount {
	int findSum(int arr[]) {
		int sum=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>0) {
				sum=sum+arr[i];
			}
		}
		return sum;
	}

}
