package basics;

//prgm to find single digit

import java.util.Scanner;

public class SingleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a=scan.nextInt();
		//&& - logical operator->combine multiple conditions
		//&& - AND operator--> All conditions must be true
		
		if(a>=-9&&a<=9)
		{
			System.out.println(a+" is a single digit");
		}
		else
		{
			System.out.println(a+" is not  a single digit");
		}
		scan.close();
		

	}

}
