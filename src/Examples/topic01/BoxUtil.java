package topic01;

public class BoxUtil {

	// non-generic method using wildcards
	public static boolean compare1(Box<?> b1, Box<?> b2) {
		return b1.getContent().equals(b2.getContent()); 
	}

	// generic method 
	public static <T> boolean compare2(Box<T> b1, Box<T> b2) {
		return b1.getContent().equals(b2.getContent()); 
	}

	// generic method 
	public static <T> Couple<T> couple(Box<T> b1, Box<T> b2) {
		return new Couple<T>(b1.getContent(), b2.getContent());
	}

	public static void main(String[] args) {
		Box<String> box1 = new Box<>("Hello");
		Box<String> box2 = new Box<>("World");
		Box<Integer> box3 = new Box<>(10);
		
		BoxUtil.compare1(box1, box2); // OK
		BoxUtil.compare1(box1, box3); // OK

		BoxUtil.compare2(box1, box2); // OK
		BoxUtil.compare2(box1, box3); // Not OK
		
		Couple<String> c1 = BoxUtil.couple(box1, box2); // OK
		Couple<String> c2 = BoxUtil.couple(box1, box3); // Not OK
	}
}