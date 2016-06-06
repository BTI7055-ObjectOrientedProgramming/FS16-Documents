package topic04;

public class HelloAnyone implements Runnable {

	private String name;
	private int delay;
	private int n;

	public HelloAnyone(String name, int delay, int n) {
		this.name = name;
		this.delay = delay;
		this.n = n;
	}

	@Override
	public void run() {
		for (int i = 0; i < this.n; i++) {
			try {
				Thread.sleep(this.delay);
				System.out.println("Hello " + this.name);
			} catch (InterruptedException e) {}
		}
	}

	public static void main(String[] args) {
		Thread thread1 = new Thread(new HelloAnyone("World", 3000, 5));
		Thread thread2 = new Thread(new HelloAnyone("Universe", 1000, 10));
		System.out.println("Starting...");
		thread1.start();
		thread2.start();
	}
}
