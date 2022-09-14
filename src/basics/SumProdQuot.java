package basics;

import java.util.Scanner;

//3  write a prgm that accept two integer inputs from user and obtain sum,product,difference and division
public class SumProdQuot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First Input : ");
		int num1=scan.nextInt();
		System.out.println("Enter Second Input : ");
		int num2=scan.nextInt();
		int sum=num1+num2;
		int product=num1*num2;
		int difference=num1-num2;
		int quotient=num1/num2;
		System.out.println("The Sum of "+num1+" and "+num2+" : "+sum);
		System.out.println("The Product of "+num1+" and "+num2+" : "+product);
		System.out.println("The Difference of "+num1+" and "+num2+" : "+difference);
		System.out.println("The Quotient of "+num1+" and "+num2+" : "+quotient);
		scan.close();
		


	}

}
