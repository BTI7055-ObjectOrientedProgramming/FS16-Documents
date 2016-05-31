package topic03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("a1", "a2", "b1", "c2", "c1", "d1");
		
		// Standard solution
		List<String> filteredList = new ArrayList<>();
		for (String s: list) {
			if (s.startsWith("c")) {
				filteredList.add(s.toUpperCase());
			}
		}
		Collections.sort(filteredList);
		for (String s: filteredList) {
			System.out.println(s); // prints C1 C2
		}

		// Solution with streams
		Stream<String> stream = list.stream();
		stream
			.filter(s -> s.startsWith("c"))
			.map(String::toUpperCase)
			.sorted()
			.forEach(System.out::println); // prints C1 C2
	}

}
