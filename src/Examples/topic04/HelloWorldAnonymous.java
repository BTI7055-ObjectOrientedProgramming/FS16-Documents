package topic04;

public class HelloWorldAnonymous {
	
	public static void main(String[] args) {
		Runnable helloWorld = new Runnable(){
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
					System.out.println("Hello World");
				} catch (InterruptedException e) {}
			}
		};
		Thread thread = new Thread(helloWorld);
		System.out.println("Starting...");
		thread.start();
	}
}
