package topic04;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {

	public static void main(String[] args) {

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		
		executor.scheduleAtFixedRate(() -> {
				System.out.println("start new task");
			}, 3, 1, TimeUnit.SECONDS);
		
		executor.schedule(() -> {
			System.out.println("Hello World");
		}, 5, TimeUnit.SECONDS);

		executor.schedule(() -> {
				executor.shutdown();
		}, 10, TimeUnit.SECONDS);

		do { // nothing
		} while (!executor.isTerminated());
		System.out.println("All threads finished");
	}
}