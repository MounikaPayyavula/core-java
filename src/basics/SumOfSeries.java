package basics;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,n,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of n : ");
		n=s.nextInt();
		s.close();
		while(i<=n)
		{
			sum+=i;
			i=i+1;
			System.out.println(sum);
			
		}
		System.out.println("The sum of series is : "+sum);

	}

}
