package arrayprograms;

public class OddNumbers {
	int CountOfOddNumbers(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				count++;
			}
		}
		return count;
		
	}

	

	

}
