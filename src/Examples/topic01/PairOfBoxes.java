package topic01;

import java.util.List;

public class PairOfBoxes<S, T> extends Pair<Box<S>, Box<T>> {

	public PairOfBoxes(Box<S> first, Box<T> second) {
		super(first, second);
	}

	public PairOfBoxes(S firstContent, T secondContent) {
		super(new Box<S>(firstContent), new Box<T>(secondContent));
	}

	public S getFirstContent() {
		return this.getFirst().getContent();
	}

	public T getSecondContent() {
		return this.getSecond().getContent();
	}

	public void setFirstContent(S content) {
		this.getFirst().setContent(content);
	}

	public void setSecondContent(T content) {
		this.getSecond().setContent(content);
	}
	
	public static void main(String[] args) {

		PairOfBoxes<String, Integer> pairOfBoxes = new PairOfBoxes<>("HelloWorld", 200);

		Box<String> box1 = pairOfBoxes.getFirst();
		Box<Integer> box2 = pairOfBoxes.getSecond();

		String s = pairOfBoxes.getFirstContent();
		Integer i = pairOfBoxes.getSecondContent();
	}
}
