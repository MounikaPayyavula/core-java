package oopsdemo2;
class Bank
{
	int getRateofInterest()
	{
		return 0;
	}
	void display()
	{
		System.out.println("Welcome to Bank");
		
	}
}	
class SBI extends Bank
{
	int getRateofInterest()
	{
		return 5; 
			
	}
}	
class ICICI extends Bank
{
	int getRateofInterest()
	{
		return 7;  
				
	}
	
}
class AXIS extends Bank
{
	int getRateofInterest()
	{
		return 6;  
				
	}	

}



	

public class Overridedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     SBI b1=new SBI();
	     ICICI b2=new ICICI();
	     AXIS b3=new AXIS();
	     
	     b1.display();
	     System.out.println("The Rate of Interest in SBI is:"+b1.getRateofInterest());
		  
	     b2.display();
	     System.out.println("The Rate of Interest in ICICI is:"+b2.getRateofInterest());
	     
	     b3.display();
	     
	     System.out.println("The Rate of Interest in AXIS is:"+b3.getRateofInterest());

	}

}
