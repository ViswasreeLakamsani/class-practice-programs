package arrayprograms;

public class Grades {
	int grade(int arr[]) {
		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>75) {
				count++;
			}
		}
		return count;
	}

}
