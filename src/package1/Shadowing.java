package package1;

public class Shadowing {
	/*
	 definition
	 parameter name = class variable name
	 */
    private int x = 10; // instance variable

    public Shadowing(int x) {
        System.out.println("Parameter x: " + x); // local variable
        System.out.println("Instance variable x: " + this.x); // instance variable
    }
    
    static void test() {
    	Shadowing s = new Shadowing(100);
    }
}
