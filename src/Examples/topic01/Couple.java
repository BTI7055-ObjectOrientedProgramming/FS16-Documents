package topic01;

import java.util.ArrayList;
import java.util.List;

public class Couple<T> extends Pair<T, T> {

	public Couple(T first, T second) {
		super(first, second);
	}

	public void swap() {
		T tmp = this.getFirst();
		this.setFirst(this.getSecond());
		this.setSecond(tmp);
	}

	public List<T> toList() {
		List<T> list = new ArrayList<>();
		list.add(this.getFirst());
		list.add(this.getSecond());
		return list;
	}

	public static void main(String[] args) {

		Couple<Integer> couple = new Couple<>(100, 200);
		int i1 = couple.getFirst();
		int i2 = couple.getSecond();
		List<Integer> list = couple.toList();
	}
}
