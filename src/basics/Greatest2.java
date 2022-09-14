package basics;

import java.util.Scanner;

//prgm to find greatest of two numbers

public class Greatest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First Input : ");
		int a=scan.nextInt();
		System.out.println("Enter Second Input : ");
		int b=scan.nextInt();
		if(a>b)
		{
			System.out.println(a+" is Greatest");
		}
		else
		{
			System.out.println(b+" is Greatest");
		}
		scan.close();
		

	}

}
