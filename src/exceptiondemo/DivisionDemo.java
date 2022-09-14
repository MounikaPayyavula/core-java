package exceptiondemo;

import java.util.Scanner;

public class DivisionDemo {

	public static void main(String[] args) {
		
		double a,b,result;
		Scanner input=new Scanner(System.in);
		System.out.println("input two integers : ");
		a=input.nextDouble();
		b=input.nextDouble();
		
		try   // statements to be monitored which may throw exception
		{
			result=a/b;
			System.out.println("Result = "+result);
		}
		catch(ArithmeticException e)  //exception thrown is handled in catch block
		{
			System.out.println("Divide by Zero Error-Enter non-zero value");
			System.out.println("Exception Description : "+e.getMessage());       //1 way
			System.out.println("Exception Name & Description : "+e.toString()); //2 way
			//Details about exception name,description,Line number of code which generated exception
			e.printStackTrace();  //3 way
		}
		finally   //clean - up operations
		{
			input.close();
			System.out.println("In Finally Block - Program execution ended");
		}

	}

}
