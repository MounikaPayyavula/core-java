package basics;

import java.util.Scanner;

public class countVowels {
	
	//prgm to count vowels in a string -a,e,i,o,u

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="java is fun";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence : ");
		String s=sc.nextLine();
		String s1=s.toLowerCase();
		
		sc.close();
		int count=0;
		System.out.println("The Length of String is : "+s.length());
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')

			{
				count+=1;
				System.out.println("vowel found : "+s1.charAt(i));
			}
		}
		System.out.println("Total no.of vowels in string : "+count);
		

	}

}
