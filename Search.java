package arrayprograms;

public class Search {
	boolean isPresent(int arr[],int key) {
		for(int i=0;i<=arr.length-1;i++) {
			if(key==arr[i]) {
				return true;
			}
		}
		return false;
	}
	
	
	
}
