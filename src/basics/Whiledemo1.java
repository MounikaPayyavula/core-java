package basics;
/* prgm to display ur name 10 times
 * & numbers from 1 to 10
 * 
 * understand the concept of loop
 * Loop - A set statements executing repeatedly,until a
 * particular condition is TRUE
 */

public class Whiledemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=50;                         //loop initialization
		
		while(i<=100)                       // set a condition--TRUE
		{
			System.out.println(i+ "mouni");
			
			i=i+1;                                 //INCREMENT LOOP i++; i+=1;
			
		}
		System.out.println("Exiting the loop............");
		System.out.println("******************Reverse Loop********************");
		int j=100;
		while(j>=50)
		{
			System.out.println(j);
			j=j-1;
		}

	}

}
