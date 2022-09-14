package collectionsdemo;

import java.util.Set;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;


//Set is a unordered group of elements which stores unique elements only
public class HashSetDemo {

	public static void main(String[] args) {
	
		Set<String> programmingLanguages=new HashSet<>();
		
		programmingLanguages.add("c");
		programmingLanguages.add("c++");
		programmingLanguages.add("java");
		programmingLanguages.add("python");
		programmingLanguages.add("PHP");
		programmingLanguages.add("Ruby");
		
		programmingLanguages.add("java");
		programmingLanguages.add(null);
		programmingLanguages.add(null);
		System.out.println("====== Iterate over a HashSet using iterator()=====");
		Iterator<String> programmingLanguagesIterator=programmingLanguages.iterator() ;
		while(programmingLanguagesIterator.hasNext())
		{
			String programmingLanguage=programmingLanguagesIterator.next();
			System.out.println(programmingLanguage);
		}
		
		System.out.println("====== Iterate over a HashSet using for-each loop=====");
		for(String programmingLanguage:programmingLanguages)
		{
			System.out.println(programmingLanguage);
		}
		
		HashSet<String> p1=new HashSet<String>(programmingLanguages);
		System.out.println(p1);
		
		HashSet<String> clonep1=new HashSet<>();//empty hash set
		
		//clone the hash set
		clonep1=(HashSet<String>)p1.clone();
		//display new set after cloning
		System.out.println(clonep1);
		
		
	}

}
