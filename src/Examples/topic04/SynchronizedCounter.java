package topic04;

public class SynchronizedCounter {

	private int value = 0;

	public synchronized void countUp() {
		this.value++;
	}
	public void countDown() {
		synchronized (this) { 
			this.value--;			
		}
	}

	public static void main(String[] args) {

		int rounds = 100000;
		SynchronizedCounter counter = new SynchronizedCounter();
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
