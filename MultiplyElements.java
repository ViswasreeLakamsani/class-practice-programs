package arrayprograms;



public class MultiplyElements {
	int multiply(int arr[]) {
		int product=1;
		for(int i=0;i<=arr.length-1;i++) {
			product=product*arr[i];
			
		}
		return product;
		
	}
	

}
