package oopsdemo1;

public class ComplexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Complex c1=new Complex(10.3,67.4);  //invokes constructor
          
          Complex c2=new Complex(0.7,3.6); 
          Complex c3=new Complex(0.2,2.1);//invokes constructor
          c1.add2(c2);
          System.out.println("The addition of two complex number is : ");
          c1.display();
          System.out.println("The addition of three complex number is : ");
          c1.add2(c3);// calls method add() by passing subject c2
          
          //c3=c1+c2
          
          //System.out.println("The addition of two complex number is : ");
          c1.display();
          
          

	}

}
