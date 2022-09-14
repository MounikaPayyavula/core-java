package java8features;


//block lambda expression
public class LambdaDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyString reverseStr = str ->{
			String result="";
			for(int i=str.length()-1;i>=0;i--)
				result+=str.charAt(i);
			return result;
			
		};
		System.out.println(reverseStr.myStringFunction("Lambda Expressions"));
		System.out.println(reverseStr.myStringFunction("madam"));
		System.out.println(reverseStr.myStringFunction("snoisserpxE adbmaL"));
		
		
		//Lambda expression with single parameter
		MyString myName=(name) -> { return "Hello "+name;};
		
		System.out.println(myName.myStringFunction("Mouni"));
		
		//Lambda expression with single parameter with no parenthesis
		MyString myName1=name -> { return "Hello "+name;};
		System.out.println(myName.myStringFunction("James Gosling"));
		
	}

}
