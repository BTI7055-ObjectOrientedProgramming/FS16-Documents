package topic04;

public class FilePrinterOrderedLocks {

	private static Object fileLock = new Object();
	private static Object printerLock = new Object();
	private static int n = 100;

	public static void main(String[] args) {

		new Thread(() -> {
			synchronized (fileLock) {
				for (int i = 0; i < n; i++) {} // do something
				synchronized (printerLock) {
					System.out.println("Task 1: printing file");
				}
			}
		}).start();

		new Thread(() -> {
			synchronized (fileLock) {
				for (int i = 0; i < n; i++) {} // do something
				synchronized (printerLock) {
					System.out.println("Task 2: printing file");
				}
			}
		}).start();
	}
}