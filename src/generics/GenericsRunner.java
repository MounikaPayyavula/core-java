package generics;


//generics class - parameterized class
import java.util.ArrayList;
import java.util.List;

public class GenericsRunner<T /*extends Number*/ > {
	ArrayList<T> list=new ArrayList<>();
	public void addElement(T element) {
		list.add(element);
		
		
	}

	public void removeElement(T element) {
		list.remove(element);
		
		
	}

	private T get(int index) {
		// TODO Auto-generated method stub
		return list.get(index);
	}

	@Override
	public String toString() {
		return list.toString();
	}
	static <X> X doublevalue(X value)
	{
		return value;
	}
/*	static <X extends List> void duplicate(X list)
	{
		return list.addAll(list);
	}*/
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsRunner<String> list=new GenericsRunner<>();
		list.addElement("Element1");
		list.addElement("Element2");
		GenericsRunner<Integer> list1=new GenericsRunner<>();
		list1.addElement(1);
		list1.addElement(2);
		System.out.println(list);
		System.out.println(list1);
		list.removeElement("Element2");
		list1.removeElement(2);
		System.out.println(list);
		System.out.println(list1);
		String value=list.get(0);
		int value1=list1.get(0);
		System.out.println(value);
		System.out.println(value1);
		
		

	}

	



	

}
