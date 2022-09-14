package codingpractice;

import java.util.Arrays;
import java.util.Scanner;

public class b {
	public static int palindromePairs(String[] input1,int input2)
	{
		int n=input2;
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				String news=input1[i]+""+input1[j];
			
			    
			if(canbe(news))
			{
				count++;
			}
			}
		}
		return count;
	}
	public static boolean canbe(String str)
	{
		int count[]=new int[256];
		Arrays.fill(count, 0);
		for(int i=0;i<str.length();i++)
		{
			count[(int)str.charAt(i)]++;
			
		}
		int odd=0;
		for(int i=0;i<256;i++)
		{
			if((count[i]&1)==1)
			{
				odd++;
			}
			if(odd>1)
			{
				return false;
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=5;
		String str[]= {"abc"};
		
		System.out.println(palindromePairs(str,n));
		
		
	}

}
