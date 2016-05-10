package topic01.ex2;

import topic01.ex1.Predicate;

public class PairPredicate<S,T> implements Predicate<Pair<S, T>> {

	private Predicate<S> p1;
	private Predicate<T> p2;
	
	public PairPredicate(Predicate<S> p1, Predicate<T> p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	@Override
	public boolean test(Pair<S, T> pair) {
		boolean value1 = this.p1.test(pair.getFirst());
		boolean value2 = this.p2.test(pair.getSecond());
		return value1 && value2;
	}

}
