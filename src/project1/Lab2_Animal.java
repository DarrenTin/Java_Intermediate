package project1;

public class Lab2_Animal {

	String name = "Animal X";
	String type = "Mammal";
	
	void makeSound() {
		System.out.println("Animal makesound!");
	}

}

class Dog extends Lab2_Animal{
	void makeSound() {
		System.out.println("Dog bark!");
	}
}

class Cat extends Lab2_Animal{
	void makeSound() {
		System.out.println("Cat meow!");
	}
}