package exceptiondemo;

import java.util.Scanner;
//program to perform division of 2 no's without exception handling
public class Division {

	public static void main(String[] args) {
		
		int a,b,result;
		Scanner input=new Scanner(System.in);
		System.out.println("input two integers : ");
		a=input.nextInt();
		b=input.nextInt();  //enter 0
	
		result=a/b;          //JRE Throws Arithmetic Exception
		
		System.out.println("Result: "+result);
		input.close();
		

	}

}
