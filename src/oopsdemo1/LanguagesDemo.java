package oopsdemo1;
//program to demonstrate constructors in java
class Language
{
	private String s;
	private int version;
	

Language()//implicit/No-args constructor
{
	System.out.println(" I am a implicit constructor");
	s="python";
	System.out.println(" Hello from : "+s);
}
Language(String lang) //parameterized constructor with 1 argument
{
	System.out.println(" I am a parameterized constructor");
	this.s=lang;
	System.out.println(" Hello from : "+s);

	
}
Language(String lang,int ver)//parameterized constructor with 2 argument

{
	System.out.println(" I am a parameterized constructor with 2 arguments");
	this.s=lang;
	this.version=ver;
	System.out.println(" Hello from : "+s+" V."+version);
}
}
public class LanguagesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Language l1=new Language();   //automatically invokes implicit constructor
		Language l2=new Language("Ruby");
		Language l3=new Language("Scala");
		Language l4=new Language("Java",2);
		

	}

}
