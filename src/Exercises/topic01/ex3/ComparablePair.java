package topic01.ex3;

import topic01.ex2.Pair;

public class ComparablePair<S extends Comparable<S>, T extends Comparable<T>> extends Pair<S, T>
		implements Comparable<Pair<S, T>> {

	public ComparablePair(S first, T second) {
		super(first, second);
	}

	@Override
	public int compareTo(Pair<S, T> other) {
		int c = this.getFirst().compareTo(other.getFirst());
		if (c == 0) {
			return this.getSecond().compareTo(other.getSecond());
		}
		return c;
	}

	public static <S extends Comparable<S>, T extends Comparable<T>> Pair<S, T> getMin(ComparablePair<S, T> p1,
			ComparablePair<S, T> p2) {
		if (p1.compareTo(p2) <= 0) {
			return p1;
		} else {
			return p2;
		}
	}

	public static <S extends Comparable<S>, T extends Comparable<T>> Pair<S, T> getMax(ComparablePair<S, T> p1,
			ComparablePair<S, T> p2) {
		if (p1.compareTo(p2) > 0) {
			return p1;
		} else {
			return p2;
		}
	}

}
