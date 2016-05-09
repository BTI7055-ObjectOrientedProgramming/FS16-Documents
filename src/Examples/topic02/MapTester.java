package topic02;

import java.util.HashMap;
import java.util.Map;

public class MapTester {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Hello");
		map.put(5, "World");
		map.put(7, "Hello");
		map.put(10, "Hello World");
		map.put(10, "Hello World!"); // replaces previous value
		
		System.out.println(map.keySet()); // prints [1, 5, 7, 10]	
		System.out.println(map.values()); // prints [Hello, World, Hello, Hello World!]
		
		String str1 = map.get(1);
		if (str1 != null) {
			System.out.println(str1); // prints "Hello"
		}
		String str2 = map.get(2);
		if (str2 != null) {
			System.out.println(str2); // nothing is printed
		}
		
		// the following code is less efficient
		int key = 1;
		if (map.containsKey(key)) {
			System.out.println(map.get(key)); // prints "Hello"
		}
	}
}
