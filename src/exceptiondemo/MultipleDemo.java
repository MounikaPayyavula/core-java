package exceptiondemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleDemo {

	public static void main(String[] args) throws IOException {
	try
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a,b,c;
		System.out.println("Enter any 2 Numbers ");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		c=a/b;
		System.out.println("C Value :"+c);
	}
	catch(NumberFormatException nfe)
	{
		System.out.println("please pass only integer values "+nfe);
	}
	catch(ArithmeticException ae)
	{
		System.out.println("please don't pass the second value as 0"+ae);
	}
	}

}
