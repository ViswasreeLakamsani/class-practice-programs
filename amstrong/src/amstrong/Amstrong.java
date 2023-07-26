package amstrong;

public class Amstrong {
	public int findAmstrong(int n,int count) {
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			int s=(int)Math.pow(rem, count);
			sum=sum+s;
			n=n/10;
		}
		return sum;
	}

}
