package arrayprograms;

public class PrimeNumber {
	void prime(int arr[]) {
		
		for(int i=0;i<=arr.length-1;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
					
					
				}
				
			}
			if(isPrime) {
				System.out.println(i);
			}
			
		}
		
		
	}
	
		
		
	

}
