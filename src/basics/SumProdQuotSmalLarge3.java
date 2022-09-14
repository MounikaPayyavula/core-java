package basics;
//4 write a prgm that accept three integer inputs from user and

//obtain small,largest,sum,product,difference and average

import java.util.Scanner;

public class SumProdQuotSmalLarge3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First Input : ");
		int num1=scan.nextInt();
		System.out.println("Enter Second Input : ");
		int num2=scan.nextInt();
		System.out.println("Enter Third Input : ");
		int num3=scan.nextInt();
		int sum=num1+num2+num3;
		int product=num1*num2*num3;
		int difference=num1-num2-num3;
		int average=(num1+num2+num3)/3;
		System.out.println("The Sum of "+num1+" and "+num2+" and "+num3+" : "+sum);
		System.out.println("The Product of "+num1+" and "+num2+" and "+num3+" : "+product);
		System.out.println("The Difference of "+num1+" and "+num2+" and "+num3+" : "+difference);
		System.out.println("The Average of "+num1+" and "+num2+" and "+num3+" : "+average);
		if((num1>num2)&&(num1>num3))
		{
			System.out.println(num1+" is the largest number.");
		}
		else if((num1==num2)&&(num2==num3))

		{
			System.out.println("All numbers are equal.");
		}
		else if(num1==num2)

		{
			System.out.println("num1 and num2 are equal.");
		}
		else if(num1==num3)

		{
			System.out.println("num1 and num3 are equal.");
		}
		else if(num2==num3)

		{
			System.out.println("num3 and num2 are equal.");
		}
		
		
		else if(num2>num3)

		{
			System.out.println(num2+" is the largest number.");
		}
		
		
		else 
		{
			System.out.println(num3+" is the largest number.");
		}	
		
		if((num1<num2)&&(num1<num3))
		{
			System.out.println(num1+" is the smallest number.");
		}
		else if((num2<num1)&&(num2<num3))

		{
			System.out.println(num2+" is the smallest number.");
		}
		else if((num1==num2)&&(num2==num3))

		{
			System.out.println("All numbers are equal.");
		}
		else
		{
			System.out.println(num3+" is the smallest number.");
		}	
		
	}

}
