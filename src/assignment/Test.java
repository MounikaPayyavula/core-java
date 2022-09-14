package assignment;
class Member
{
	String name;
	int age;
	long phoneNumber;
	String Adress;
	int salary;
	
	
	public Member(String name, int age, long phoneNumber, String adress, int salary) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		Adress = adress;
		this.salary = salary;
	}
    public void printSalary()
	{
		System.out.println("Salary : "+salary);
	}
	
	

}

//Employee class inherits member class

class EmployeeA extends Member
{
	String specialzation;
	
	
	public EmployeeA(String name, int age, long phoneNumber, String adress, int salary, String specialzation	) {
		super(name, age, phoneNumber, adress, salary);
		this.specialzation = specialzation;

}
}
	
//Manager class inherits member class
	
class Manager extends Member
{
		
		String department;
		
		public Manager(String name, int age, long phoneNumber, String adress, int salary,
				String department) {
			super(name, age, phoneNumber, adress, salary);
		
			this.department = department;
}
}
	
//main class
		
public class Test {
			
	public static void main(String[] args) {
		
		EmployeeA emp=new EmployeeA("James", 40, 2345678912L, "68D-WALLSTREET", 70000,  "IT");
		Manager manager=new Manager("Anb",50,4567387687L,"nehru street",100000,"IT");
		
		emp.printSalary();
		

		manager.printSalary();
		
		System.out.println(emp.name+"\t"+emp.age+"");
		
	}
				
			}
			

	

