package oopsdemo1;

import java.util.Scanner;

public class Student {
//instance class
	
		// TODO Auto-generated method stub
		//properties/state/attributes
		private int rollNumber;
		private String name;
		private String course;
		private float m1,m2,m3,total;
		Scanner s=new Scanner(System.in);
		
		
		//instance methods/behaviors/functions
		public void input()
		{
			System.out.println("Enter roll no,name,course:");
			rollNumber=s.nextInt();
			name=s.next();
			course=s.next();
			System.out.println("Enter marks of 3 subjects:");
			m1=s.nextFloat();
			m2=s.nextFloat();
			m3=s.nextFloat();
			s.close();
		}
		public float calculate()   //method with return type float
		{
			total=m1+m2+m3;
			return total;
		}
		public void display()
		{
			System.out.println("**************STUDENT DETAILS**************");
			System.out.println("Roll No     :"+rollNumber);
			System.out.println("Name        :"+name);
			System.out.println("Course      :"+course);
			System.out.println("TotalMarks  :"+total);
			System.out.println("*******************************************");
		}
			
		
		
		

	

}
