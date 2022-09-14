package basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {11,10,20,30,40,50,77,222};
		int i;
		System.out.println("************Array contents***********");
		for(i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
		System.out.println("The size of Array is : "+num.length);
		System.out.println("First Element of Array is : "+num[0]);
		System.out.println("Last Element of Array is : "+num[num.length-1]);
		
		//Enter values to array at runtime
		System.out.println("*******************************************************");
		int n,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2nd array size : ");
		n=s.nextInt();
		int[] num1=new int[n];
		System.out.println("Enter array elements : ");
		for(j=0;j<n;j++)
		{
			num1[j]=s.nextInt();		
			}
		System.out.println("************2 Array contents***********");
		for(j=0;j<num1.length;j++)
		{
			System.out.print(num1[j]+ " ");
		}
	System.out.println();
		System.out.println("Displaying array elements without loop : ");
		System.out.println(Arrays.toString(num1));
		
		

	}

}
