package topic03;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSources {

	public static void main(String[] args) {

		Stream<Integer> stream;

		// From an array
		Integer[] array = new Integer[] { 1, 2, 3, 4, 5 };
		stream = Arrays.stream(array);
		stream = Stream.of(array);

		// From a collection (list)
		List<Integer> list = Arrays.asList(array);
		stream = list.stream();
		stream = list.parallelStream();

		
		// From a collection (set)
		Set<Integer> set = new HashSet<>(list);
		stream = set.stream();
		stream = set.parallelStream();

		// From a seed and an update function
		stream = Stream.iterate(0, x -> x + 1);

		// From a supplier
		Random random = new Random();
		stream = Stream.generate(() -> random.nextInt());

		// From a stream builder
		Stream.Builder<Integer> builder = Stream.builder();
		builder.add(1);
		builder.add(2).add(3).add(4).add(5);
		stream = builder.build();
		
		// From a random generator
		IntStream ints = new Random().ints(1, 100);
		DoubleStream doubles = new Random().doubles(0.0, 1.0);
		
		// From a string
		IntStream chars = "12345".chars();

		// From a text file
		Path path = FileSystems.getDefault().getPath("src/topic03", "numbers.txt");
		try {
			Stream<String> lines = Files.lines(path);
			lines.forEach(System.out::println);
		} catch (IOException e) { }
	}

}
