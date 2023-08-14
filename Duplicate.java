package arrayprograms;

public class Duplicate {
 boolean duplicate(int arr[]) {
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					return true;
				}
				
				}
				
			}
		return false;
		}
		
	
}


