package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//program to iterate in Array List using various constructs

public class ArrayListIterationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("Michael")	;  //AutoBoxing
		names.add("James")	;
		names.add("Andy")	;
		names.add("Jim")	;
		names.add("Robert")	;
		
		
		System.out.println(names);
		
		System.out.println("*** Display 	collection using Iterator ***");
		
		//Iterator interface for traversing 
		
		Iterator<String>  itr=names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("***********************************");
		
		System.out.println(names.get(1));
		
		names.add(3, "Raj");  //adding element in specified index
		names.remove(0);      //delete first element
		names.set(1, "java");  //replace existing element
		
		
		
		System.out.println("**Display collection using Enhanced For Loop***");
		
		for(String i:names)
		{
			System.out.println(names);
		}
		
		
		ArrayList<Double> marks=new ArrayList<Double>();
		marks.add(999.5);
		marks.add(999.1);
		marks.add(999.2);
		marks.add(999.3);
		marks.add(999.4);
		
		System.out.println();
		
		for(Double i:marks)
		{
			System.out.println(i);

		}
		
		Collections.sort(marks);
		System.out.println(marks);


		
		
		
		
		
		
		
		
		
		
		

	}

}
