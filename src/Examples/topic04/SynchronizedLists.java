package topic04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedLists {

	public static void main(String[] args) throws Exception {
		
		List<Integer> list1 = new ArrayList<>();
		
		new Thread(() -> {
			for (int i=0; i<1000; i++) {
				list1.add(i);
			}
		}).start();
		
		new Thread(() -> {
			for (int i=0; i<1000; i++) {
				list1.add(i);
			}
		}).start();
		
		List<Integer> list2 = Collections.synchronizedList(new ArrayList<>());

		new Thread(() -> {
			for (int i=0; i<1000; i++) {
				list2.add(i);
			}
		}).start();
		
		new Thread(() -> {
			for (int i=0; i<1000; i++) {
				list2.add(i);
			}
		}).start();

		Thread.sleep(100); // wait for threads to terminate
		System.out.println(list1.size());
		System.out.println(list2.size());
	}

}
