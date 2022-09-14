package oopsdemo3;

public class TestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Student.collegeChange();  ---------RVCE  //invoke static method even before creating obj
		
		Student s1=new Student(100, "mike");
		Student s2=new Student(101, "john");
		Student s3=new Student(102, "mary");
		
		s1.display();
		s2.display();
		s3.display();
	}

}
