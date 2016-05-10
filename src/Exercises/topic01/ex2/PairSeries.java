package topic01.ex2;

import topic01.ex1.Function;
import topic01.ex1.Predicate;
import topic01.ex1.Series;

public class PairSeries<S, T> extends Series<Pair<S, T>> {

	public PairSeries(Series<S> s1, Series<T> s2) {
		this(s1.getInitialValue(), s1.getUpdate(), s1.getCondition(), s2.getInitialValue(), s2.getUpdate(),
				s2.getCondition());
	}

	public PairSeries(S initialValue1, Function<S> update1, Predicate<S> condition1, T initialValue2,
			Function<T> update2, Predicate<T> condition2) {
		super(new Pair<S, T>(initialValue1, initialValue2), new PairFunction<S, T>(update1, update2),
				new PairPredicate<S, T>(condition1, condition2));
	}
	
}
