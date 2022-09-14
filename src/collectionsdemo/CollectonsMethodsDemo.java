package collectionsdemo;
import java.util.ArrayList;
import java.util.Collections;
/* Collection is an utility class in java.util package
 * It consist of only static methods
 * which are used to operate on objects of type collection.
 * 
 */
public class CollectonsMethodsDemo {

	public static void main(String[] args) {
	
		//create a list of strings 
ArrayList<String> a1=new ArrayList<String>();
		
		//add elements to arrayList  &it maintains the order of insertion
		
		a1.add("Java for Developers")	;  //AutoBoxing
		a1.add("Friends")	;
		a1.add("Dear")	;
		a1.add("Is")	;
		a1.add("Superb")	;    //Duplicate elements
		
		System.out.println("Array List before Sorting : "+a1);
	Collections.sort(a1);
		System.out.println(a1);
		
		//Let us print the sorted list
		System.out.println("List after the use of "+"Collection.sort() :\n"+a1);
		
		//shuffle,binary search are class level methods--does not belong to specific class 
		
		int pos=Collections.binarySearch(a1, "Superb");
		System.out.println("The position of \"Superb\" in ArrayList is : +pos");
		
		
		Collections.reverse(a1);
		System.out.println("List after the Reversing  : "+a1);
		
		
		Collections.swap(a1, 4, 1);
		System.out.println("List after the Swapp  : "+a1);
		
		Collections.shuffle(a1);
		System.out.println("List after the Shuffle  : "+a1);
		ArrayList<String> n=new ArrayList<String>(5);
		n.add("Java");
		n.add("Fri");
		
		n.add("De");
		n.add("Ist");
		n.add("Sup");
		System.out.println(n);
		Collections.copy(n, a1);
		System.out.println("The new ArrayList ontents :  "+n);
		n=a1;
		System.out.println("The new ArrayList ontents :  "+n);
		
		
		
		ArrayList<String> n1=new ArrayList<String>(5);
		n1.addAll(a1);
		System.out.println(n1);
		
		ArrayList<String> n2=new ArrayList<String>(5);
		n2=(ArrayList<String>)a1.clone();  //copy of ArrayList
		System.out.println(n2);
		

	}

}
