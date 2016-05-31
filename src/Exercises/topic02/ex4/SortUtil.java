package topic02.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class SortUtil {

	public static <T extends Comparable<T>> void sort(List<T> list) {
		PriorityQueue<T> pq = new PriorityQueue<>();
		while (!list.isEmpty()) {
			pq.add(list.remove(0));
		}
		while (!pq.isEmpty()) {
			list.add(pq.poll());
		}
	}

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 4, 3, 8, 6, 4, 9, 7, 2, 1));
		sort(l1);
		System.out.println(l1); // prints [1, 1, 2, 3, 4, 4, 6, 7, 8, 9]

		List<String> l2 = new ArrayList<>(Arrays.asList("A", "N", "C", "A", "P", "W"));
		sort(l2);
		System.out.println(l2); // prints [A, A, C, N, P, W]
	}

}
