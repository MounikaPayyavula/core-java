package collectionsdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//creating a linked list
		LinkedList<String> friends=new LinkedList<String>();
		
		//Adding new elements to the end of the  LinkedList using add() method
		friends.add("mouni");
		friends.add("lalli");
		friends.add("baby");
		friends.add("likki");
		friends.add("gayatri");
		
		System.out.println("Initial LinkedList : "+friends);
		
		//Adding the element at the specified position in the LinkedList
		
		friends.add(3, "Lissa");
		System.out.println("After add(3,\"Lisa\") : "+friends);
		
		//Adding an element at the beginning of the Linked List
		friends.addFirst("Steve");
		System.out.println("After addFirst(\"Steve\") : "+friends);
		//Adding an element at the end of the Linked List--it is equivalent to add(
		
		friends.addLast("Jennifer");
		System.out.println("After addLast(\"Jennifer\") : "+friends);
		//Adding all the elements from an existing collection to the end of the Linked List
		List<String> familyFriends=new ArrayList<String>();
		familyFriends.add("Jesse");
		familyFriends.add("Walt");
		
		friends.addAll(familyFriends);
		System.out.println("After addAll(familyFriends) : "+friends);
	
		System.out.println("***********Retrieve Elements from Linked List******************* ");
		System.out.println("First Friend in a list : "+friends.getFirst());
		System.out.println("Last Friend in a list : "+friends.getLast());
		System.out.println("Search a  Friend in position 3  : "+friends.get(3));
		System.out.println("Delete a Last  Friend in a list : "+friends.removeLast());
		System.out.println("Find position of mouni  in a list : "+friends.indexOf("mouni"));
	
		System.out.println("LinkedList Contents : ");
		for(String s: friends)
		{
			System.out.println(s);
		}
		
		
		




		

	}

}
