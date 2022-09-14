package oopsdemo3;

import oopsdemo1.Bicycle;

class Test
{
	int a;
	private int b;
	protected int c;
	public int d;
	
	
	public Test(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	    d=500;
	}
	
	
	public void display()           //public method
	{
		System.out.println("Private variable   : "+b);
	}
	
	
}

class Test2 extends Test
{
	
	
	public Test2(int a, int b, int c) {
		super(a, b, c);

	}
	public void display()             //public method
	{
		System.out.println("protected variable : "+c);
	}

	
	
	public void print()              //default method
	{
		System.out.println("Hello from default method");
	}
	
	
	
}

public class AccessSpecifiersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test(100,200,300);
		
		t1.display();
		//t1.b=50 //compiler error  ---cannot access private variable
		System.out.println("Default variable   : "+t1.a);
		
		
		
        Test2 t2=new Test2(100,200,300);
		t2.display();
		
		
		
		
		Bicycle sportsBicycle=new Bicycle();
		
		
		
		//access public method of oopsdemo1.Bicycle
		sportsBicycle.startCycling();
		
		//access default method of oopsdemo1.Bicycle----compiler error
		//sportsBicycle.applyBrake();
		

	}

}
