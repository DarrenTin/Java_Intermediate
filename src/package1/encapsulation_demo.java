package package1;

public class encapsulation_demo {
	private int age = 30;
	private String secret = "Woman age is a secret.";
	
	public static void demo() {
		System.out.println("Demo created");
		encapsulation_demo demo = new encapsulation_demo();
    	demo.setSecret(10, "ower");
    	System.out.println(demo.getAge());
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getSecret() {
		return secret + "\nBut my age is " + getAge();
	}
	
	public void setSecret(int age, String password) {
		if(password == "power") {
			this.age = age;
		}
		else {
			System.out.println("Password incorrect!");
		}
		
	}

}


