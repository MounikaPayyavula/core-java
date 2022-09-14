package oopsdemo3;

final class Hello
{
	final void display()
	{
		System.out.println("This is  a final method");
	}
}

/*class World extends Hello   //final  classes cannot be extended
{
	
	//final method cannot be overridden
	final void display()
	{
		System.out.println("This is  a final method");
	}
}*/
public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int AGE=20;
		final float PI=3.142f;
		System.out.println(AGE+" "+PI);
		Hello obj=new Hello();
				obj.display();
		//AGE=30;  //compilation error -final variable values cannot be changed

	}

}
