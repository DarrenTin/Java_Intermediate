package package1;

public class multithreading {
	static int staticCounter = 0; // Static variable shared among all instances
    static void static_multithreading() {
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                staticCounter++; // Increment static counter
                System.out.println(Thread.currentThread().getName().replace("Thread-", "")
                		+ " = " + staticCounter);
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }
    
    
    int nonStaticCounter = 0; // Non-static variable
    void incrementCounter() {
        for (int i = 0; i < 5; i++) {
            nonStaticCounter++; // Increment non-static counter
            System.out.println(Thread.currentThread().getName().replace("Thread-", "")
            		+ " = " + nonStaticCounter);
        }
    }
    
    static void non_static_multithreading() {
        multithreading example = new multithreading();
        Thread thread1 = new Thread(example::incrementCounter);
        Thread thread2 = new Thread(example::incrementCounter);
        thread1.start();
        thread2.start();
    }
}

