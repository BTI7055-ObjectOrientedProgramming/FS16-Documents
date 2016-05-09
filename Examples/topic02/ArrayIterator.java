package topic02;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<E> implements Iterator<E> {

	private E[] array;
	private int currentIndex;
	
	public ArrayIterator(E[] array) {
		this.array = array;
		this.currentIndex = 0;
	}

	@Override
	public boolean hasNext() {
		return this.currentIndex < this.array.length;
	}

	@Override
	public E next() {
		if (!this.hasNext()){
			throw new NoSuchElementException();
		}
		return this.array[this.currentIndex++];
	}

}
