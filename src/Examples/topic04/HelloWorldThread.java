package topic04;

public class HelloWorldThread extends Thread {
	
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
			System.out.println("Hello World");
		} catch (InterruptedException e) {}
	}

	public static void main(String[] args) {
		Thread thread = new HelloWorldThread();
		System.out.println("Starting...");
		thread.start();
	}
}
