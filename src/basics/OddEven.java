package basics;
// prgm to find even or odd number
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a=scan.nextInt();
		if(a%2==0)
		{
			System.out.println(a+" is a Even number");
		}
		else
		{
			System.out.println(a+" is a Odd number");
		}
		scan.close();
		}
	}


