package oopsdemo2;

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer d1=new Developer(101,"James Gosling", "JDBC");
		Developer d2=new Developer(101,"Rod Johnson", "Spring Framework");
		d1.display();  //child class object invokes parent class method
		
	d1.display1();             //child class object invokes parent class method
	
	d2.display();
	d2.display1();

	}

}
