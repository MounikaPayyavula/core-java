package java8features;

public class LambdaDemo2 {
	public static void main(String[] args) {
		
	
	NumericTest isEven=(n) -> (n%2==0);
    NumericTest isNegative =(n) ->(n<0);

    System.out.println(isEven.computeTest(7));
    System.out.println(isNegative.computeTest(-55));
    
    System.out.println("7 is Even Number : "+isEven.computeTest(7));
    System.out.println("-55 is negative Number :  "+isNegative.computeTest(-55));

    //boolean a=(n) -> (n%2==0); //error - lambda expressions should be stored in instance of F
}
}
