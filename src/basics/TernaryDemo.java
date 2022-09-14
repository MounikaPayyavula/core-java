package basics;

public class TernaryDemo {
	public static void main(String[] args) {
		int a=100,b=220,max;
		System.out.println("First number : "+a);
		System.out.println("First number : "+b);
		
		
		max=(a>b)?a:b;
		String msg=(a>b)?"A is greatest":"B is greatest";
		System.out.println("The maximum of 2 no's is : "+max+"."+msg);
	}

}
