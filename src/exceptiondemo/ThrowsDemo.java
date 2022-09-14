package exceptiondemo;

public class ThrowsDemo {
	void Division() throws ArithmeticException
	{
		int a=45,b=0,result;
		result=a/b;
		System.out.print("\n\tThe Result is  : "+result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsDemo T=new ThrowsDemo();
		try
		{
			T.Division();
		}
		catch(ArithmeticException Ex)
		{
			System.err.print("\n\tError : "+Ex.getMessage());
		}
		System.out.print("\n\tEnd of program.");

	}

}
