package collectionsdemo;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//program to traverse list in forward & backward direction
//using Listiterator
public class ListIteratorDemo {

	public static void main(String[] args) {
		
	
	//create a linked list
	LinkedList<String> linkedList=new LinkedList<String>();
	
	linkedList.add("Delhi");
	linkedList.add("Agra");
	linkedList.add("Mysore");
	linkedList.add("Chennai");
	linkedList.add("Pune");
	
	//obtaining ListIterator - traverse in forward/backward direction 
	ListIterator<String> listIt=linkedList.listIterator(/* for backward iteration linkedList.size()*/);

	//Iterating the list in Forward direction
	System.out.println("\n Forward  Iteration : ");
	while(listIt.hasNext())
	{
		System.out.println(listIt.next());
	}
	
	//Iterating the list in backward direction
	System.out.println("\n Backward Iteration : ");
	while(listIt.hasPrevious())
	{
		System.out.println(listIt.previous());
	}
	
	
	System.out.println("**********South Cities ***********");
	System.out.println("using subList() Method of List Interface to extract data from List : ");
	List<String> scities=linkedList.subList(2, 4);
	System.out.println(scities);
	
	//obtaing ListIterator - traverse directly in backward direction
	ListIterator<String> listIt1=linkedList.listIterator( linkedList.size());
	System.out.println("\n Backward Iteration : ");
	while(listIt1.hasPrevious())
	{
		System.out.println(listIt1.previous());
	}
	
}
}
