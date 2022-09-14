package assignmentjava8;

public class LambdaExpression {

	public static void main(String[] args) {
		// compute is odd number
		MyInterface even=(n)->(n%2!=0);
		
		
		// compute is prime number
		MyInterface prime=(n)->{
			boolean result=true;
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
					result=false;
				
			}
			return result;
		};
		
		// compute is palindrome
		MyInterface palindrome=(n)->{
			int rev=0;
			int temp=n;
			boolean result=false;
			while(n!=0)
			{
				rev=(rev*10)+(n%10);
				n=n/10;
			}
			if(temp==rev)
				result=true;
			return result;
		};
		
		System.out.println("Odd  Number  : "+even.compute(20));
		System.out.println("Prime Number : "+prime.compute(20));
		System.out.println("Palindrome   : "+palindrome.compute(346));

	}

}
