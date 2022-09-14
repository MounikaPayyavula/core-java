package basics;

import java.util.Arrays;

//prgm to demonstrate various built in array functions 
public class ArrayFunctionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n1= {2,3,4,12,12,-2};
		int[] n2=new int[n1.length];
		int[] n3=new int[5];
		
		System.out.println("Display array contents without Loop : ");
		System.out.println("n1 = "+Arrays.toString(n1));
		System.out.println("Display array contents with Enhanced for Loop : ");
		for(int i:n1)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		//cpy entire array n1 to n2
		System.arraycopy(n1, 0, n2, 0, n1.length);
		
		//conver array to string and print
		
		System.out.println("n2 = "+Arrays.toString(n2));
		
		//copy partial array elements 
		System.arraycopy(n1, 2, n3, 1, 2);
		System.out.println("n3 = "+Arrays.toString(n3));
		
		
		//sort an array
		Arrays.sort(n2);
		System.out.println("Sorted n2 array : "+Arrays.toString(n2));
		
		n2[1]=77;
		n2[5]=100;
		System.out.println("Sorted n2 array : "+Arrays.toString(n2));
		
		
		

	}

}
