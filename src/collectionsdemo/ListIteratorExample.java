package collectionsdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		
		List<String> carList=new LinkedList<String>();
		carList.add("Audi");
		carList.add("Jaguar");
		carList.add("BMW");
		carList.add("Audi");
		carList.add("Mini Cooper");
		
		System.out.println(carList);
		
		//Getting ListIterator
		ListIterator<String> itr=carList.listIterator();
		while(itr.hasNext())
		{
			String car=itr.next();
			if(car.equals("BMW"))
			{
				itr.add("Mercedes");
			}
			if(car.equals("Mini Cooper"))
			{
				itr.set("Camry");
			}
			if(car.equals("Audi"))
			{
				itr.remove();
			}
			
		}
		System.out.println("List elements - "+carList);
		
		
		
		// new arrayList from LL
		List<String> a=new ArrayList<String>(carList);
		System.out.println(a);

	}

}
