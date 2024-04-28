package project1;

public class Lab5_Test {
	public static void test(Lab5_Calculator c) {
//		assert c.add(11, 22) == 33: "addition error";
//		assert c.substract(10, 4) == 6: "subtraction error";
//		assert c.multiply(25, 5) == 125: "multiplication error";
//		assert c.divide(10, 2) == 5: "division error";
		if(c.add(11, 22) != 33) {
			System.out.println("Addition error");
		}
		else if(c.substract(10, 4) != 6) {
			System.out.println("Subtaction error");
		}
		else if(c.multiply(25, 5) != 125) {
			System.out.println("Multiplication error");
		}
		else if(c.divide(10, 2) != 5) {
			System.out.println("Division error");
		}
		else {
			System.out.println("Testing passed!");
		}
	}

}
