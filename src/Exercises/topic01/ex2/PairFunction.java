package topic01.ex2;

import topic01.ex1.Function;

public class PairFunction<S, T> implements Function<Pair<S, T>> {

	private Function<S> f1;
	private Function<T> f2;
	
	public PairFunction(Function<S> f1, Function<T> f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public Pair<S, T> apply(Pair<S, T> pair) {
		S value1 = this.f1.apply(pair.getFirst());
		T value2 = this.f2.apply(pair.getSecond());
		return new Pair<>(value1, value2);
	}

}
