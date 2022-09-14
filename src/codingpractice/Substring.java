package codingpractice;

import java.util.Scanner;

public class Substring {
	 static void subString(char str[], int n) {
	     int cn=0, co=0;

	        for (int len = 1; len <= n; len++) {

	            // Pick ending point

	            for (int i = 0; i <= n - len; i++) {

	                //  Print characters from current

	                // starting point to current ending

	                // point.  

	                int j = i + len - 1;

	                for (int k = i; k <= j; k++) {

	                	char a=str[k];
	                   System.out.print(a);
	                  
	                  

	                }
	               if((j-i)%2!=0)
	            	   cn++;
	               else
	            	   co++;
	 

	                System.out.println();
	               

	            }

	           
	        }
	        //return counteven+""+countodd;
	        System.out.println(cn+" "+co);

	    }
	 
	// Driver program to test above function

	   public static void main(String args[])
	   {
	     Scanner s=new Scanner(System.in);
	     String st=s.next();
	     char[] str=st.toCharArray();
	     
	     subString(str, str. length);
	     //System.out.println(subString(str, str. length));
	   }
	 }