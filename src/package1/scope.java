package package1;

public class scope {
	int instance_var = 1;
	static int class_var = 1;
	
	static void test_scope() {
		scope s = new scope();
		s.instance_var += 100;
		s.class_var += 100;
		scope t = new scope();
		System.out.println("Instance variable: " + t.instance_var); // 1
		System.out.println("Class variable: " + t.class_var); // 101
		// one variable of instance change, all variable of instances change
		// AKA variable shared among all instance
	}
}