package topic02;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReverseArrayIterator<E> implements Iterator<E> {

	private E[] array;
	private int currentIndex;

	public ReverseArrayIterator(E[] array) {
		this.array = array;
		this.currentIndex = array.length - 1;
	}

	@Override
	public boolean hasNext() {
		return this.currentIndex >= 0;
	}

	@Override
	public E next() {
		if (!this.hasNext()) {
			throw new NoSuchElementException();
		}
		return this.array[this.currentIndex--];
	}

}
