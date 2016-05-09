package topic02;

import java.util.Iterator;

public class IteratorTester {

	public static void main(String[] args) {

		Integer[] values = new Integer[] { 1, 3, 3, 5, 6, 9 };

		Iterator<Integer> i1 = new ArrayIterator<>(values);
		while (i1.hasNext()) {
			System.out.print(i1.next() + " ");
		}
		System.out.println();
		// prints 1 3 3 5 6 9 
		
		Iterator<Integer> i2 = new ReverseArrayIterator<>(values);
		while (i2.hasNext()) {
			System.out.print(i2.next() + " ");
		}
		System.out.println();
		// prints 9 6 5 3 3 1 
	}

}
