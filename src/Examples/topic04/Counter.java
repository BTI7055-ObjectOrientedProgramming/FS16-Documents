package topic04;

public class Counter {

	private int value = 0;

	public void countUp() {
		this.value++;
	}

	public void countDown() {
		this.value--;
	}

	public static void main(String[] args) {

		int rounds = 100000;
		Counter counter = new Counter();

		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < rounds; i++)
				counter.countUp();
		});
		thread1.start();

		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < rounds; i++)
				counter.countDown();
		});
		thread2.start();

		do { // nothing
		} while (thread1.isAlive() || thread2.isAlive());
		System.out.println(counter.value);
	}
}
