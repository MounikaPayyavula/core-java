package newfeatures;
interface IDemo
{
	void sum(int x,int y);
}
class Calculation
{
	void addition(int a,int b)
	{
		System.out.println("The Addition is : "+(a+b) );
	}
}
public class MethodReferenceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation c1= new Calculation();
		IDemo d1=(a,b)->System.out.println("The Addition is : "+(a+b));
		d1.sum(10, 20);
		
		
		//using method reference
		IDemo d2=c1::addition;
		d2.sum(60,40);
				

	}

}
