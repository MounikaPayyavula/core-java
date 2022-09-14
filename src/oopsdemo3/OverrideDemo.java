package oopsdemo3;
class SoftwareEngineer
{
	protected String name,tech;
	double salary;
	
	
	public SoftwareEngineer(String name, String tech, double salary) {
		super();
		this.name = name;
		this.tech = tech;
		this.salary = salary;
	}
	
	final void diplay()
	{
		System.out.println(name+" "+tech+" "+salary);
	}
	
	void work()
	{
		System.out.println("Coding & Testing");
	}
	
}
 class Developer extends SoftwareEngineer
 {

	double salary;
	public Developer(String name, String tech, double salary) {
    super(name, tech, salary);
		
	}
	
	void work()
	{
		System.out.println("Coding using :"+tech);
	}
 	 
 	 
 }
 class Tester extends SoftwareEngineer
 {

	 
	public Tester(String name, String tech, double salary) {
		super(name, tech, salary);
		
	}
	
	void work()
	{
		System.out.println("Testing Using :"+tech);
	}
	 
 }




public class OverrideDemo {

	public static void main(String[] args) {
	SoftwareEngineer s1=new SoftwareEngineer("Sai", "Java", 960000.f);
		
		Developer d1=new Developer("Kiran", "Python", 50000);
		
		Tester t1 = new Tester("Surya", "Jmeter",45000);
		
		s1.diplay();
		s1.work();
		
		d1.diplay();
		d1.work();
		
		t1.diplay();
		t1.work();
		

	}

}
