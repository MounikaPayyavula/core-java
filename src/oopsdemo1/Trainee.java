package oopsdemo1;
//prgm to demonstrate constructors
//generate constructors --->Right click-->source--->generate constructor

public class Trainee {
	private int id;
	private String name,tech;
	private double stipend;
	
	
	
	
	public Trainee() {
	System.out.println(" i am implicit constructor");
		
	this.id=111;
	this.name="James Gosling";
	this.tech="java";
	this.stipend=5000;
	}
	

	public Trainee(int id, String name, String tech, double stipend) {
		this.id = id;
		this.name = name;
		this.tech = tech;
		this.stipend = stipend;
	}


	void display()
	{
		System.out.println("**********Trainee details****************");
		System.out.println(this.id+" "+this.name+" "+this.tech+" "+this.stipend);
		System.out.println("-----------------------------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainee t1=new Trainee();//invokes implicit constructor
		t1.display();
		
		//invokes parameterized constructor
		Trainee t2=new Trainee(222,"Rod Johnson","spring",7000);
		t2.display();
		
		Trainee t3=new Trainee(333, "Gavin King", "Hibernate", 6000);
		t3.display();
		

	}

}
