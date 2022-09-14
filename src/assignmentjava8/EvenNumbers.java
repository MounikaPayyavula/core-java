package assignmentjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers= Arrays.asList(2,3,4,5,6,7,8);
		List<Integer> even=numbers.stream().filter(number->number%2==0).collect(Collectors.toList());
		System.out.println("Even Numbers : "+even);
		even.forEach(System.out::println);
		

	}

}
