package basics;

//java prgm to pass command line arguments

public class CommandLineDemo {
	public static void main(String[] args) {
		if(args.length==0)
		{
			System.out.println("Zero args");
		}
		String name=args[0];
		int a=Integer.parseInt(args[1]);
		int b=Integer.parseInt(args[1]);
		int sum=a+b;
		System.out.println("Hello "+name);
		System.out.println("Sum: "+sum);
		
		
	}

}
