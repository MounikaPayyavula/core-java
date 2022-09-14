package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//generic arrayList
		ArrayList<String> a1=new ArrayList<String>();
		
		//add elements to arrayList  &it maintains the order of insertion
		
		a1.add("java")	;  //AutoBoxing
		a1.add("perl")	;
		a1.add("c++")	;
		a1.add("c# 5.0")	;
		a1.add("java")	;    //Duplicate elements
		a1.add("python")	;
		System.out.println(a1);
		
		
		//get elements by index
		System.out.println("Element at Index 1 : "+a1.get(1));
		System.out.println("Does list contains element Java ?:"+a1.contains("java"));
		
		//add a element at specific index
		a1.add(2, "oracle");
		
		System.out.println(a1);
		System.out.println("Is ArrayList Empty ? :"+a1.isEmpty());
		System.out.println("Index of Perl : "+a1.indexOf("perl"));
		System.out.println("Size of ArrayList : "+a1.size());
		
		Collections.sort(a1);
		System.out.println("Array List after sorting : "+a1);
		
		//a1.add(100);  //compile time error
		
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(100);
		a2.add(500);
		a2.add(73);
		a2.add(66);
		a2.add(350);
		
		System.out.println(a2);
		System.out.println("Size : "+a2.size());
		
		
		
		
		
		
		
	}

}
