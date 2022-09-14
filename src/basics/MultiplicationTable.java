package basics;
//java program to display multiplication table of a number

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int i=1;
		System.out.println("The multiplication table of "+n+" is : ");
		do
		{
			System.out.println(n+" * "+i+" = "+(n*i));
			i++;
		}while(i<=10);
		

	}

}
