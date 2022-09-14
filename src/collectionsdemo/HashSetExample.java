package collectionsdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> fruits= new HashSet<>();
		//add example
		
		fruits.add("Apple");
		fruits.add("Banana");
		
		//isEmpty example
		System.out.println("fruits set is empty : "+fruits.isEmpty());
		
		//contains example
		
		System.out.println("fruits contain Apple : "+fruits.contains("Apple"));
		System.out.println("fruits contain Mango : "+fruits.contains("Mango"));
		
		//remove example
		System.out.println(" Apple removed from fruits set : "+fruits.remove("Apple"));
		System.out.println(" Mango removed from fruits set : "+fruits.remove("Mango"));
		
		//size example
		System.out.println("  fruits set size  : "+fruits.size());
		
		//addAll example
		List<String> list=new ArrayList<>();
		list.add("Apple");list.add("Apple");
		list.add("Banana");list.add("Mango");
		
		System.out.println("fruits  set before addAll : "+fruits);
		System.out.println("List : "+list);
		
		fruits.addAll(list);
		System.out.println("fruits  set after addAll : "+fruits);
		
		//Iterator example
	Iterator<String> iterator=fruits.iterator();
	while(iterator.hasNext()) {
		System.out.println("Consumin fruit "+iterator.next());
	}
	
	System.out.println("HashSet fruits Contents :"+fruits);

    TreeSet<String> fTs=new TreeSet<String>(fruits);

    System.out.println("HashSet Fruits Converted into Treeset : "+fTs);
	//removeAll example
	fruits.add("Orange");
	System.out.println("fruits  set before removeAll : "+fruits);
	fruits.removeAll(list);
	System.out.println("fruits  set after removeAll : "+fruits);
	
	
	//clear example
	fruits.clear();
	System.out.println("Fruits set is empty : "+fruits.isEmpty());
	
		
		


	}

}
