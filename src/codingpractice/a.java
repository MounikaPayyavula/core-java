package codingpractice;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 String input1=sc.next();
	String input2=sc.next();
		String input3=sc.next();
		String input4=sc.next();
		input1=input1.replace(input2,"");
				input1=input1.replace(input3,"");
				input1=input1.replace(input4,"");
				System.out.println(input1.length());
		
				
				
			

	}

}
