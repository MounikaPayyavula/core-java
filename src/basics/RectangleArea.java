package basics;

import java.util.Scanner;

//6,8 ask the user to give two double input for length and breadth of rectangle 
//and print area of Rectangle type casted to int  

public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of rectangle :");
		double length=sc.nextDouble();
		System.out.println("enter breadth20 of rectangle :");
		double breadth=sc.nextDouble();
		int area=(int)(length*breadth);
		System.out.println("Area of Rectangle : "+area);
		sc.close();
		
		
		

	}

}
