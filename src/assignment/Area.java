package assignment;

import java.util.Scanner;

public class Area {
	
	
	public int returnArea(int l,int b)
	{
		
		
		return l*b;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter length        :");
		int le=s.nextInt();
		System.out.print("Enter breadth       :");
		
		int breadth=s.nextInt();
		Area r=new Area();
		System.out.print("Area of the rectangle : ");
		System.out.println(r.returnArea(le, breadth));
		s.close();
		
		
		
		
		

	}

}
