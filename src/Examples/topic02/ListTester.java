package topic02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTester {

	public static int ROUNDS = 500000;

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<>();
		System.out.println("ArrayList: start...");
		for (int i = 1; i <= ROUNDS; i++) {
			l1.add(0, "Hello");
		}
		System.out.println("done");

		List<String> l2 = new LinkedList<>();
		System.out.println("LinkedList: start...");
		for (int i = 1; i <= ROUNDS; i++) {
			l2.add(0, "World");
		}
		System.out.println("done");
	}
	
}
