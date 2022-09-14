package java8features;
@FunctionalInterface
interface MyFI
{
	public String sayHello();//by default abstract
	//public String sayHello1();  //bcoz functional interface has only one abstract method
	
}

public class LambdaDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 
		MyFI msg=() -> { return "Hello World";};//Lambda Expression
		System.out.println(msg.sayHello());
	}

}
