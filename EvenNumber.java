package arrayprograms;

public class EvenNumber {
	int countOfEvenNumbers(int arr[]) {
		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2==0) {
				count++;
			}
		}
		return count;
	}

}
