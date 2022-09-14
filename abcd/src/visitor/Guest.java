package visitor;

public class Guest{
	public int mov(int a,int b,int c,int d) {
		int s=a+b+c+d;
		return s;
		
	}
	public static void main(String args[])
	{
		int sum=0,x;
		for( x=0;x<=10;x++)
		
			sum+=x;
		
		System.out.println("sum"+x);
		System.out.println("="+sum);
		Guest g=new Guest();
		//int r=g.mov(10, 20);
		
	}
}
