package oopsdemo3;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trainee t1=new Marks("John", "New York", 1001,35);
		
		t1.show();       //invoke abstract base class method
		
		double marks=t1.calculateMarks();       //invoke sub class method
		System.out.println(t1+" "+marks);

	}

}
