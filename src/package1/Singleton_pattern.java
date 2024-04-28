package package1;

public class Singleton_pattern {
	private static Singleton_pattern singleton_instance = null;
	private Singleton_pattern() {}
	// public getter
	public static Singleton_pattern get_new_singleton() {
		if(singleton_instance == null) { 
			singleton_instance = new Singleton_pattern();
		}
		return singleton_instance;
	}
	
	void doSomething() {
		System.out.println("Instatiated!");
	}
	
	static void demo() {
		Singleton_pattern s = Singleton_pattern.get_new_singleton();
		s.doSomething();
		Singleton_pattern nono = Singleton_pattern.get_new_singleton();
		nono.doSomething();	
	}
}
