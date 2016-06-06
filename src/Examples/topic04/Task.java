package topic04;

public class Task implements Runnable {
	private int id;
	public Task(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ": start task " + this.id);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ": end task " + this.id);
	}
}