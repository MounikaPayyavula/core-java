package assignment;

public class Employee {
	
	//attributes
	
	private String name;
	private int yearOfJoining;
	private int salary;
	private String address;
	
	
	

	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getYearOfJoining() {
		return yearOfJoining;
	}




	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}




	public int getSalary() {
		return salary;
	}




	public void setSalary(int salary) {
		this.salary = salary;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}
	




	@Override
	public String toString() {
		return "Employee [name=" + name + ", yearOfJoining=" + yearOfJoining +  ", address= "+ address + "]";
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		emp.setName("Robert");
		emp.setSalary(5000);
		emp.setYearOfJoining(1994);
		emp.setAddress("64C-WallsStreet");
		emp1.setName("Sam");
		emp1.setSalary(6000);
		emp1.setYearOfJoining(2000);
		emp1.setAddress("68D-WallsStreet");
		emp2.setName("John");
		emp2.setSalary(7000);
		emp2.setYearOfJoining(1999);
		emp2.setAddress("26B-WallsStreet");
		System.out.println(emp.getName()+"\t"+emp.getYearOfJoining()+"\t"+emp.getAddress());
		System.out.println(emp1.getName()+"\t"+emp1.getYearOfJoining()+"\t"+emp1.getAddress());
		
		System.out.println(emp2.getName()+"\t"+emp2.getYearOfJoining()+"\t"+emp2.getAddress());
		
		

		
		

	}

}
