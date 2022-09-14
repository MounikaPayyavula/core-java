package basics;

import java.util.Scanner;

//2. write a prgm that converts Fahrenheit to celsius using formula :celsius=(5/9)(fahrenheit-32)

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float fahrenheit=sc.nextFloat();
		float celsius;
		celsius=(5*(fahrenheit-32))/9;
		System.out.printf("Fahrenheit to celsius :%.2f ",celsius);
		
		sc.close();

	}

}
