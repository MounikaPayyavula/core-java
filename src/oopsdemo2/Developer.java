package oopsdemo2;

//child class - Inheritance - is a relationship
public class Developer extends Employee {
	String technology;
	
	public Developer(int empId, String name,String t) {
		super(empId, name);
		this.technology=t;
		
	}

	void display1()
	{
		System.out.println("Technology used : "+technology);
	}

	

}
