package package1;

public class static_method {
	static void sm(){
		// static method belong to class itself, instead of instance
		System.out.println("I am static method");
	}
	
	void me(){
		System.out.println("I am method");
	}
	
	static void static_test() {
		sm();
		
		static_method m = new static_method();
		m.me(); // cannot used before instantiate
	}
	
	void normal_test() {
		System.out.println("I am not static, need to initialized!");
	}
}
