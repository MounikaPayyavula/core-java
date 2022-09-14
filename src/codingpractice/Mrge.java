package codingpractice;

import java.util.Scanner;

public class Mrge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		int c[]=new int[m+n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<m;i++)
		{
			b[i]=s.nextInt();
		}
		for(int element:a)
		{
			c[j]=element;
			j++;
			
		}
		for(int element:b)
		{
			c[j]=element;
			j++;
			
		}
		

		for(int element:c)
		{
			System.out.println(element);
			
		}
}
}
