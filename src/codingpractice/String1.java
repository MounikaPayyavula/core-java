package codingpractice;

import java.util.Arrays;

public class String1 {
	public static int isSubstring(String[] str) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<str.length-1;i++)
			for(int j=i+1;j<str.length;j++)
			{
				System.out.println(str[i]+" "+str[j]);
				if(shuffle(str[i],str[j]))
				{
					count++;
					System.out.println(str[i]+" "+str[j]);
				}
			}
		System.out.println("=====================================");
			
		return count;
	}


	public static boolean shuffle(String string, String string2) {
		// TODO Auto-generated method stub
		int n=string.length();
		int m=string2.length();
		if(n>m)
		{
			return false;
		}
		else
		{
			System.out.println(string+" "+string2);
			
			
			string=sort(string);
			

			
			System.out.println(string);
			for(int i=0;i<m;i++)
			{
				if(i+n-1>=m)
					return false;
				String str="";
				for(int j=0;j<n;j++)
					str+=string2.charAt(i+j);
				    str=sort(str);
				System.out.println(str);
				if(str.equals(string))
					return true;
				
			}
			
		}
		return false;
	}





	public static String sort(String str) {
		// TODO Auto-generated method stub
		
		char[] temp=str.toCharArray();
		Arrays.sort(temp);
		return String.valueOf(temp);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"hacker","int","niltnt","hackhackerer","long"};
		int a=isSubstring(str);
		System.out.println(a);

	}

	
}
