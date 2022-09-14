package oopsdemo1;

public class ConstructorDemo {
	int id;
	String name;
	float salary;
	
	ConstructorDemo()
	{
		System.out.println("I am implicit constructor");
		id=100;
		name="Mike";
		salary=5000.00f;
	}
	//generate constructor with arguments
	//right click--->source--->generate constructor using fields
	ConstructorDemo(int id,String n,float sal)
	{
		System.out.println("I am parameterized constructor");
		this.id=id;
		this.name=n;
		this.salary=sal;
	}
	
	void display()
	{
		System.out.println(this.id+" "+this.name+" "+this.salary);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorDemo cd1=new ConstructorDemo();    //invokes implicit constructor
		ConstructorDemo cd2=new ConstructorDemo(101,"john",6000.00f);  //invokes parameterized constructor
		ConstructorDemo cd3=new ConstructorDemo();
		cd1.display();
		cd2.display();
		

	}

}
