package assignment;

import java.util.Scanner;

// instance class 
class Employee1
{
	private int salary;
	private int noOfHours;
	
	public void getInfo(int sal,int hours)
	{
		this.salary=sal;
		this.noOfHours=hours;
		
	}
	
	public void  addSal(int sal)
	{
		if(sal<500)
		{
			salary=sal+10;
		}
		System.out.println("$"+salary);
	}
	
	public void addWork(int sal,int hours)
	{
		if(hours>6)
		{
			salary=sal+5;
		}
		System.out.println("$"+salary);
	}
	
	
}
public class Employee1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter Employee salary                : ");
		int salary=sc.nextInt();
		System.out.print(" Enter no of hours of work per day of : ");
		int noOfHours=sc.nextInt();
		
		Employee1 e=new Employee1();
		e.getInfo(salary, noOfHours);
		System.out.print("Salary after calling AddSal()         :");
		e.addSal(salary);
		System.out.print("Salary after calling AddWork()        :");
		e.addWork(salary, noOfHours);
		
	

	}

}
