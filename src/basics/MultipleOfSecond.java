package basics;
// 5. write a prgm that reads 2 integers
//determine first is a multiple of second and print result

import java.util.Scanner;

public class MultipleOfSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First Input : ");
		int num1=scan.nextInt();
		System.out.println("Enter Second Input : ");
		int num2=scan.nextInt();
		if((num1%num2)==0)
		{
			System.out.println(num1+" is a multiple of "+num2);
		}
		scan.close();
		

	}

}
