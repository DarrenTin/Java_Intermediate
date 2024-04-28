package package1;

public class Volatile {
	static class SharedData{
		volatile int counter = 0;
		
		void increment() {
			counter++;
		}
	}
	
	static void test() {
		SharedData data = new SharedData();
		System.out.println("begin - " + data.counter);
		Thread t1 = new Thread(()->{
			for(int i = 0; i < 2; i++) {
				data.increment();
				System.out.println("t1 - " + data.counter);
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i = 0; i < 2; i++) {
				data.increment();
				System.out.println("t2 - " + data.counter);
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("final - " + data.counter);
	}
}
