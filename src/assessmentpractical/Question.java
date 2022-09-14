package assessmentpractical;

import java.util.stream.IntStream;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IntStream.of(1,1,3,3,7,6,7)
.distinct().parallel().map(i->i*2).sequential().forEach(System.out::print);
	}

}
