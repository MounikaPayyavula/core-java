package basics;
// 7. total marks and percentage
import java.util.Scanner;

public class TotalmarksPercentage7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter marks : ");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First subject marks  : ");
		float num1=scan.nextInt();
		System.out.println("Enter Second subject marks  : ");
		float num2=scan.nextInt();
		System.out.println("Enter Third subject marks  : ");
		float num3=scan.nextInt();
		float totalMarks=num1+num2+num3;
		System.out.println("Total Marks obtained :  "+totalMarks+"/300");
		float percentage=(totalMarks*100)/300;
		System.out.println("Percentage : "+percentage);
		scan.close();
		
		

	}

}
