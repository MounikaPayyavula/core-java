package miscellaneous;

public class genericMethoddemo {
	
	//generic method
	public static <E> void printArray(E[] inputArray)
	{
		//for each loop
		for(E element:inputArray)
		{
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		//create arrays of Integer,Double and Character
		
		Integer[] intArray= {1,2,3,4,5};
		Double[]  doubleArray= {1.1,2.2,3.3,4.4,5.5};
		Character[] charArray= {'h','e','l','l','o'};
		System.out.println("Array Integer Array contains: ");
		printArray(intArray);   //pass an Integer array
		System.out.println("Array Double Array contains: ");
		printArray(doubleArray);  //  pass an Double array
		System.out.println("Array Character Array contains: ");
		printArray(charArray);   //pass an Character array
		}

	}


