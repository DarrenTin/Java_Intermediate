package project1;

import java.util.InputMismatchException;
import java.util.Scanner;

interface calculator{
	double add(double x, double y);
	double substract(double x, double y);
	double multiply(double x, double y);
	double divide(double x, double y);
	void prompt();
}

class Lab5_Calculator implements calculator{

	public double add(double x, double y) {
		// TODO Auto-generated method stub
		return x + y;
	}

	public double substract(double x, double y) {
		// TODO Auto-generated method stub
		return x - y;
	}

	public double multiply(double x, double y) {
		// TODO Auto-generated method stub
		return x * y;
	}

	public double divide(double x, double y) {
		if(y == 0) {
			throw new IllegalArgumentException("Cannot divide zero!");
		}
		return x / y;
	}
	
	public void prompt() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Choose your options:\n1. add\n2. substact\n3. multiply\n4. divide");
			
			String option = sc.nextLine();
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			
			switch(option) {
				case("1"): System.out.println(add(a, b)); break;
				case("2"): System.out.println(substract(a, b)); break;
				case("3"): System.out.println(multiply(a, b));break;
				case("4"): System.out.println(divide(a, b));break;
				default: System.out.println("invalid input");break;
			}
			
			sc.close();
			
		} catch (InputMismatchException e){
			System.out.println("Please input number only!");
		} catch(IllegalArgumentException e) {
			System.out.println("Cannot divide by zero!");
		}
	}
	
}
