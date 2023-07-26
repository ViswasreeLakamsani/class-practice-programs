package sumofdigits;

public class Sum {
	int findSum(int n,int sum) {
		while(n!=0) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
			
			
		}
		return sum;
	}

}
