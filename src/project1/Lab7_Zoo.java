package project1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Lab7_Zoo {
	private String zoo_name;
	private String zoo_location;
	ArrayList<String> Animals = new ArrayList<>();
	
	public Lab7_Zoo(String zoo_name, String zoo_location) {
		this.zoo_name = zoo_name;
		this.zoo_location = zoo_location;
	}
	
	void add_animal(String ...animals ) { // args kwarg
		for(String a: animals) {
			Animals.add(a);
		}
	}
	
	void add_animal(Animal ...animals ) { // args kwarg
		for(Animal a: animals) {
			Animals.add(a.name);
		}
	}
	
	void feed_animal() {
		ArrayList<Object> food_detail = prompt_food();
//		System.out.println(food_detail);
//		String a = (String) food_detail.get(0);
//		String food = (String) food_detail.get(1);
//		float weight = (float) food_detail.get(2);
		feed_animal((String) food_detail.get(0), 
				(String) food_detail.get(1), 
				(float) food_detail.get(2));
	}
	
	void feed_animal(String a, String food, float weight) {
		System.out.printf("Feeding %s the %s at %.2f gram!\n", a, food, weight);
	}
	
	void feed_animal(Animal a, String food, float weight) {
		System.out.printf("Feeding %s the %s at %.2f gram!\n", a.name, food, weight);
	}
	
	ArrayList<Object> prompt_food() {
		Scanner scan = new Scanner(System.in);
		ArrayList<Object> food_detail = new ArrayList<>();
		System.out.print("Animal: ");
		food_detail.add(scan.nextLine());
		System.out.print("Food: ");
		food_detail.add(scan.nextLine());
		System.out.print("Amount(gram): ");
		food_detail.add(scan.nextFloat());
		scan.close();
		return food_detail;
	}
	
	void list_animal() {
		System.out.print("Animal in " + zoo_name + " are ");
//		for(String a Animals) {
//			System.out.print(a + ", ");
//		}
		for(int i = 0; i < Animals.size(); i++) {
			System.out.print(Animals.get(i));
			if(!(i == Animals.size() - 1)) {
				System.out.print(", ");
			} 
			if(i == Animals.size() - 2) {
				System.out.print("and ");
			}
		}
		
	}
}

class Animal {
	protected String name = "animal_name";
	protected String species = "species_name";
	protected int age;
	
	public Animal(String name) {
		this.name = name;
	}
	
	void eat() {
		System.out.println(name + " is eating!");
	}
	
	void makeSound() {
		System.out.println(name + " is making " + species + " sound!");
	}
}

class Mammal extends Animal{
	Boolean lay_egg = false;
	Boolean warm_blood = true;
	Boolean can_fly = false;
	
	public Mammal(String name) {
		super(name);
	}
	
	void running() {
		System.out.println(this.name + " is running!");
	}
}

class Bird extends Animal{
	Boolean lay_egg = true;
	Boolean warm_blood = true;
	Boolean can_fly = true;
	
	public Bird(String name) {
		super(name);
	}
	
	void flying() {
		System.out.println(this.name + " is flying!");
	}
}

class Reptile extends Animal{
	Boolean lay_egg = true;
	Boolean warm_blood = false;
	Boolean can_fly = false;
	
	public Reptile(String name) {
		super(name);
	}
	
	void swimming() {
		System.out.println(this.name + " is swimming!");
	}
}

class Lion extends Mammal{

	public Lion(String name) {
		super(name);
	}
	
	void makeSound() {
		System.out.println(this.name + " is roaring!");
	}
	
}

class Eagle extends Bird{

	public Eagle(String name) {
		super(name);
	}
	
	void makeSound() {
		System.out.println(this.name + " is screeching!");
	}
	
}