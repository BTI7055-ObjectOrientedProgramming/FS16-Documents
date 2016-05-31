package topic03;

import java.util.stream.Stream;

public class ParallelStream {

	public static void main(String[] args) {

		Stream.iterate(1, x -> x+1).limit(10)
			.forEach(System.out::println);
		// prints 1 2 3 4 5 6 7 8 9 10
		
		Stream.iterate(1, x -> x+1).limit(10)
			.parallel()
			.forEach(System.out::println);
		// prints for example 7 6 3 1 4 8 2 5 10 9
	}
}
