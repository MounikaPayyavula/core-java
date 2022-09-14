package basics;

import java.util.Scanner;

public class DoWhileDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,column;
		System.out.println("************Multiplication table ***************\n");
		row=1;
		
		Scanner s=new Scanner(System.in);
		// do while loop continues
		//until entered number is positive
		
		do {
			column=1;
			do {
				int mul=row*column;
				System.out.print(mul+"\t");
				column++;
			}while(column<=10);
			System.out.println();
			row++;
			
		}while(row<=10);

	}

}
