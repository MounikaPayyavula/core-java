package basics;
//prgm to find sum of natural nos from 1 to 100

public class ForDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,n=100;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
			System.out.println(sum);
		}
		System.out.println("The Sum : "+sum);

	}

}
