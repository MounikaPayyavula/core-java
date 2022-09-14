package exceptiondemo;

import java.util.Scanner;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result=0;
		int arr[]=new int[5];
		Scanner input=new Scanner(System.in);
		try
		{
			int num1=input.nextInt();
			int num2=input.nextInt();
			arr[0]=0;
			arr[1]=1;
			arr[2]=2;
			arr[3]=3;
			arr[4]=4;
			arr[5]=5;
			result=num1/num2;
			System.out.println("Result of Division : "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Err: Divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Err: Array Index out of Bound");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
