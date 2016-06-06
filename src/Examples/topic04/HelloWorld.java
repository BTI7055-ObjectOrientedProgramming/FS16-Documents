package topic04;

public class HelloWorld implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
			System.out.println("Hello World");
		} catch (InterruptedException e) {}
	}
	
	public static void main(String[] args) {
		Runnable helloWorld = new HelloWorld();
		Thread thread = new Thread(helloWorld);
		System.out.println("Starting...");
		thread.start();
	}
}
