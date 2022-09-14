package collectionsdemo;

import java.util.HashSet;
import java.util.Set;

//hash set with user defined objects
public class HashSetDemoUserDefined {
	Set<Customer> customers;  //declare a hash set of type customer
	
	public void  HashSetDemoUserDefined() {
		System.out.println("HashSet with customer object ");
		customers = new HashSet<>();
	}

	void addCustomer()
	{
		
		//add new customer object to the set
		customers.add(new Customer(101, "Arun", "Bengaluru"));
		customers.add(new Customer(102, "mouni", "Tirupathi"));
		customers.add(new Customer(103, "lalli", "Tirupathi"));
		customers.add(new Customer(101, "Riya", "Sydney"));
		
		
		
		
	}
	void displayCustomer()
	{
		System.out.println("**********Customer List *****************");
		for(Customer i:customers)
		{
			System.out.println(i.getId()+" "+i.getName()+" "+i.getCity());
		}
	}


	
	
	

	public static void main(String[] args) {
		HashSetDemoUserDefined hashSet=new HashSetDemoUserDefined();
		hashSet.HashSetDemoUserDefined();
		
		
		hashSet.addCustomer();
		hashSet.displayCustomer();
		
		
				
		
		

	}

	



	
}
