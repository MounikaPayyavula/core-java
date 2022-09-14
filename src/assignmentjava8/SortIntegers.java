package assignmentjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(50,20,100,10,0,80,30);
		System.out.println("Unsorted List : "+numbers);
		
		List<Integer> sortedList=numbers.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted List   : "+sortedList);
		

	}

}
