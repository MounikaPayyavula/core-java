package assignment;
class Rectangle1
{
	public int length;
	public int breadth;
	public Rectangle1(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public void area()
	{
		System.out.println("Area : "+length*breadth);
	}
	public void perimeter()
	{
		System.out.println("Perimeter : "+(2*(length+breadth)));
	}
	
}
class Square extends Rectangle1
{
	public Square(int s) {
		
		super(s,s);
		//this.length=s;
		//this.breadth=s;
		
	}
/*	public void area()
	{
	super.area();
	}
	public void perimeter()
	{
	super.perimeter();
	}*/

	
	
}


public class Main {

	public static void main(String[] args) {
		
		
		Rectangle1 r=new Rectangle1(4,5);
		Square s= new Square(4);
		
		//"area of rectangle: "
		r.area();
		
		//"perimeter of rectangle"
		r.perimeter();
		
		//"area of square : "
		s.area();
		//"perimeter of square: "
		s.perimeter();
		

	}

}
