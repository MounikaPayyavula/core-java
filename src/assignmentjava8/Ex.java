package assignmentjava8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(50,20,100,10,0,80,30);
	
		Integer  sum=numbers.stream().mapToInt(i->i).sum();
		
		OptionalDouble  average=numbers.stream().mapToInt(i->i).average();
		OptionalInt  max=numbers.stream().mapToInt(i->i).max();
		OptionalInt  min=numbers.stream().mapToInt(i->i).min();
		System.out.println(sum);
		System.out.println(average);
		System.out.println(max);
		System.out.println(min);



	}

}
