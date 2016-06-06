package topic04;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterWithLock {

	private int value = 0;
	private Lock lock = new ReentrantLock();

	public void countUp() {
		lock.lock();
		this.value++;
		lock.unlock();
	}

	public void countDown() {
		lock.lock();
		this.value--;
		lock.unlock();
	}

	public static void main(String[] args) {

		int rounds = 100000;
		CounterWithLock counter = new CounterWithLock();

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
