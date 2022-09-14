package oopsdemo1;

class Employee100
{
	int empId;
	String name;
	public void setData(int c,String d)
	{
		empId=c;
		name=d;
	}
	public void showData()
	{
		System.out.println("Emp ID: "+empId+" Employee Name :  "+name);
		System.out.println();
	}
}
public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		//create array of employee object
		Employee100[] obj=new Employee100[5];
		
		//create actual employee object
		for(int i=0;i<5;i++)
		{
			obj[i]=new Employee100();
		}
		
		//assign data to employee objects
		obj[0].setData(100, "James");
		obj[1].setData(101, "Mouni");
		obj[2].setData(102, "ravin");
		obj[3].setData(103, "Navin");
		obj[4].setData(104, "Mavin");
		
		//display employ object data
		System.out.println("***********Employee Details*****************");
		for(int i=0;i<5;i++)
		{
			obj[i].showData();
		}
		System.out.println("*******************************************");
		
	}

}
