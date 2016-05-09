package topic02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class CollectionTester {

	public static void main(String[] args) {
		
		Collection<String> c1 = new ArrayList<>();
		c1.add("Hello");
		c1.add("World");
		c1.size(); // returns 2
		System.out.println(c1); // prints "[Hello, World]"
		
		Collection<String> c2 = new LinkedList<>(c1);
		c2.add("!");
		c2.add("!");
		c2.size(); // returns 4
		c2.remove("World");
		c2.size(); // returns 3
		System.out.println(c2); // prints "[Hello, !, !]"
		
		Collection<String> c3 = new HashSet(c2);
		c3.add("World");
		c3.add("World");
		c3.size(); // returns 3		
		System.out.println(c3); // prints "[!, Hello, World]"
	}

}
