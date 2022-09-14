package codingpractice;

import java.util.Arrays;

public class Palindrome {
	 static boolean isPalindrome(char[] a,char[] b)
	    { 
		 
		 int count=0;
		  for(int i=0;i<a.length;i++)
		    {
		        for(int j=0;j<b.length;j++)
		        {
		            if(a[i]==b[j]){
		              count++;
		             }
		        }
		    }
		if(count==a.length||count==b.length)
		{
			return true;
		}
		return false;
	    }
		
				 
	    
	 static char[] remove(char a[])
	 {
		 char[] temp = new char[a.length];
	        int j = 0;
	  
	        for (int i = 0; i < a.length - 1; i++) {
	            if (a[i] != a[i + 1]) {
	                temp[j++] = a[i];
	            }
	        }
	  
	        temp[j++] = a[a.length - 1];
	  
	        // Changing the original array
	        for (int i = 0; i < j; i++) {
	            a[i] = temp[i];
	        }
	  
	        return a;
	 }

	 static int checkPalindromePair(String[] str,int n)
	    {
		 int count=0;
	       for(int i=0;i<=n-1;i++)
	       {
	    	   for(int j=i+1;j<=n;j++)
	    	   {
	    		   char a[]=str[i].toCharArray();
	    		   char b[]=str[j].toCharArray();
	    		   Arrays.sort(a);
	    		   Arrays.sort(b);
	    		   char c[]=remove(a);
	    		   char d[]=remove(b);
	    		   
	    		   if(isPalindrome(c,d));
	    		   {
	    			   count++;
	    		   }
	    	   }
	       }
	       return count;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		String str[]= {"hacker","int","niltnt","hackhackerer","long"};
		  
	            System.out.println(checkPalindromePair(str,n));
	       

	}

}
