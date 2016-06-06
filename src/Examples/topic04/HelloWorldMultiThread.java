package topic04;

public class HelloWorldMultiThread {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(3000);
					System.out.println("Hello World 1");
				} catch (InterruptedException e) {}
			}
		});
		
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("Hello World 2");
				} catch (InterruptedException e) {}
			}
		});
		
		System.out.println("Starting...");
		thread1.start();
		thread2.start();
	}
}
