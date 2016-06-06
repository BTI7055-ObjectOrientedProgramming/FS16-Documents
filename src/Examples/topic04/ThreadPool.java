package topic04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 12; i++) {
			Runnable task = new Task(i);
			executor.execute(task);
		}
		executor.shutdown();
		do { // nothing
		} while (!executor.isTerminated());
		System.out.println("All threads finished");
	}
}