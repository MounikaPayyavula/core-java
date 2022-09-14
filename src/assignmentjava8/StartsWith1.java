package assignmentjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWith1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers= Arrays.asList(2,3,4,5,6,7,8);
		numbers.stream().map(x->x+"").filter((x) ->x.startsWith("1")).collect(Collectors.toList()).forEach(System.out::println);		
	}

}
