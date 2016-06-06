package topic04;

public class HelloWorldLambda {
	
	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			try {
				Thread.sleep(5000);
				System.out.println("Hello World");
			} catch (InterruptedException e) {}
		});
		System.out.println("Starting...");
		thread.start();
	}
}
