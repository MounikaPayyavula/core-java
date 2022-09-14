package collectionsdemo;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		/* LinkedList Declaration*/
		
		LinkedList<String> linkedlist=new LinkedList<String>();
		/*add(String element) is used for
		 * adding the elements to the LinkedList
		 */
		
		linkedlist.add("item1");
		linkedlist.add("item5");
		linkedlist.add("item3");
		linkedlist.add("item6");
		linkedlist.add("item2");
		
		/*Display LinkedList content*/
		System.out.println("LinkedList content : "+linkedlist);
		linkedlist.offer("Item100");
		

		System.out.println("LinkedList content : "+linkedlist);
		/*Add first and last element*/
		linkedlist.addFirst("First Item");
		linkedlist.addLast("Last Item");
		System.out.println("LinkedList content after addition  : "+linkedlist);
		
		/*This is how to set and get values*/
		Object firstVar=linkedlist.get(0);
		System.out.println("First Element : ");
		
		linkedlist.set(0, "Changed first Item");
		Object firstVar2=linkedlist.get(0);
		String s=linkedlist.get(0);//Auto unboxing
		System.out.println("First Element  after update by set method : "+firstVar2);
		System.out.println("Hi "+s);
		
		//Remove first and last element
		
		linkedlist.removeFirst();
		linkedlist.removeLast();
		System.out.println("LinkedList after deletion of last and first element : "+linkedlist);
		
		
		//Add to a position and remove from a position 
		linkedlist.add(0, "Newly Added item");
		linkedlist.remove(2);
		System.out.println("Final Content : "+linkedlist);
		
		
		
		
		
		 
	}

}
