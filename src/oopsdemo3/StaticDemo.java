package oopsdemo3;

class Count
{
	static int cnt;
	int a;
	Count()
	{
		cnt+=1;
		a=100;
	}
	static void display()            //static method
	{
		System.out.println("No.of objects created : "+cnt);
	}
	void print()             //c
	{
		System.out.println("Instance method       : "+a);
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Count c1=new Count();
		Count c2=new Count();
		Count c3=new Count();
		
		c1.print();              //invokes Instance method 
		c2.print();
		c3.print();
		Count.display();          //invokes static method
		
	}

}
