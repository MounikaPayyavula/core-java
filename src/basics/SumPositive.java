package basics;

import java.util.Scanner;
// takes integer input from user
//while loop continues
//untill entered number is positive

public class SumPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("Enter n  : ");
       int  number=s.nextInt();
       int sum=0;
		while(number>=1)
		{
			sum+=number;
			System.out.println("Enter a number : ");
			number=s.nextInt();
			
		}
		System.out.println( " sum= "+sum);

	}

}
