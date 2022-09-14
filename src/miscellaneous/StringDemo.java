package miscellaneous;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="James Gosling";
		String s2="James gosling";
		String s3=new String("Hello world ");
		if(s1==s2) //strings points to same reference---location
		{
			System.out.println("Strings Are Equal");
		}
		else
		{
			System.out.println("Strings Are Not Equal");
		}
		System.out.println("The length of String \' "+s3+"\' is "+s3.length());
		String s4=s3.concat(s2);
		System.out.println(s4);
		System.out.println(s4.replace('o', 'e'));
		

	}

}
