package basics;

import java.util.Scanner;

public class SumAvg {
	public static void main(String[] args)
	{
		int a,b,c,sum;
		float avg;
		String name;
		float marks;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name:");
		name=scan.next();
		System.out.println("Enter your marks:");
		marks=scan.nextFloat();
		System.out.println("Enter 3 numbers:");
		
		
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		sum=a+b+c;
		System.out.println("The sum of "+a+" and "+b+" and "+c+" : "+sum);
		avg=(float)sum/3;
		System.out.println("The avg of "+a+" and "+b+" and "+c+" : "+avg);
		System.out.println("The avg of "+a+" and "+b+" and "+c+" : ");
		System.out.format("%.3f", avg);
		System.out.println();
		System.out.println("The avg of "+a+" and "+b+" and "+c+" : ");
		System.out.format("%.2f", avg);
		System.out.println();
		System.out.println("hello "+ name+"marks : "+marks);
		
		scan.close();
		
		
		
		
		
	}

}
