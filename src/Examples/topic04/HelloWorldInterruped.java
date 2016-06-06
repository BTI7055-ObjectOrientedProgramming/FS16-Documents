package topic04;

public class HelloWorldInterruped {

	public static void main(String[] args) {
		
		Thread thread = new Thread(() -> {
			try {
				while (!Thread.interrupted()) {
					Thread.sleep(500);
					System.out.println("Hello World");
				}
				System.out.println("Loop interrupted");
			} catch (InterruptedException e) {
				System.out.println("Sleeping interrupted");
			}
		});
		
		System.out.println("Starting...");
		thread.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		thread.interrupt();
	}
}
