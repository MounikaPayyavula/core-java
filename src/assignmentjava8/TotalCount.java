package assignmentjava8;

import java.util.Arrays;
import java.util.List;

public class TotalCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> numbers=Arrays.asList("abc","bcd","cde","ghi","klm");
		long count=numbers.stream().count();
		System.out.println(" Total number of elements present in the list : "+count);

	}

}
