package oopsdemo3;

public class Student {
	private int rollNo;
	private String name;
	private static String college="AMC";
	
	
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}



	static void collegeChange()
	{
		college="RVCE";
		 //rollNo=101;               //compiler error -bcoz non-static
	}
	
	void display() {
		System.out.println(rollNo+" "+name+" "+college);
	}
	

}
