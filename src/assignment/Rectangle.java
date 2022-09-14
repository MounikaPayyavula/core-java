package assignment;

public class Rectangle {
	int length;
	int breadth;
	
	

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		
	}
	public int  area()
	{
		return length*breadth;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle1=new Rectangle(4,5);
		Rectangle rectangle2=new Rectangle(5,8);
		System.out.println("Area of 1st rectangle : "+rectangle1.area());
		System.out.println("Area of 2nd rectangle : "+rectangle2.area());


	}

}
