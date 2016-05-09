package topic02;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTester {
	
	public static void main(String[] args) {

		Queue<String> p1 = new ArrayDeque<>(); // Insertion order
		p1.add("Peter");
		p1.add("John");
		p1.add("Tom");
		p1.add("Andrew");
		while (!p1.isEmpty()) {
			System.out.println(p1.remove());
		} // Loop prints "Peter", "John", "Tom", "Andrew"

		Queue<String> p2 = new PriorityQueue<>(); // Natural order
		p2.add("Peter");
		p2.add("John");
		p2.add("Tom");
		p2.add("Andrew");
		while (!p2.isEmpty()) {
			System.out.println(p2.remove());
		} // Loop prints "Andrew", "John", "Peter", "Tom"
		
		// String length comparator
		Comparator<String> c = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s1.length() < s2.length()) {
					return -1;
				}
				if (s1.length() > s2.length()) {
					return 1;
				}
				return 0;
			}
		};
		
		Queue<String> p3 = new PriorityQueue<>(c); 
		p3.add("Peter");
		p3.add("John");
		p3.add("Tom");
		p3.add("Andrew");
		while (!p3.isEmpty()) {
			System.out.println(p3.remove());
		} // Loop prints "Tom", "John", "Peter", "Andrew"
	}
}
