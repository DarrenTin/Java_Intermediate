package project1;
import java.util.ArrayList;
import project1.Lab6_Vehicle.*;

public class Main {

	public static void main(String[] args) {
		
//		Lab1_Car m1 = new Lab1_Car();
//		m1.displayInfo();
		
//		Lab2_Animal Animals[] = {new Cat(), new Dog(), new Lab2_Animal()};
//		for(Lab2_Animal animal: Animals) {
//			animal.makeSound();
//		}
		
		// Lab3
//		Employee Tengoku = new Employee();
//		int secret_age = Tengoku.getAge(); // implicit casting
//		int secret_id = Tengoku.getEmployeeId();
//		System.out.println("Secret age is " + secret_age);
//		System.out.println("Secret id is " + secret_id);
		
		// Lab4
//		Rectangle rec = new Rectangle();
//		Circle cir = new Circle();
//		System.out.println("Rectangle length: " + rec.getLength());
//		System.out.println("Rectangle width: " + rec.getWidth());
//		System.out.println("Rectangle perimeter: " + rec.calculatePerimeter());
//		System.out.println("Rectangle area: " + rec.calculateArea());
//		rec.setLength(12);
//		System.out.println("New rectangle area: " + rec.calculateArea());
//		
//		System.out.println("Circle radius: " + cir.getRadius());
//		System.out.printf("Circle perimeter: %.2f\n", cir.calculatePerimeter());
//		System.out.println("Circle area: " + cir.calculateArea());
//		cir.setRadius(24);
//		System.out.println("New circle perimeter: " + cir.calculatePerimeter());

		// Lab 5
//		Lab5_Calculator cal = new Lab5_Calculator();
//		Lab5_Test.test(cal);
//		cal.prompt();
		
		// Lab 6
//		vehicle v = new vehicle(); // abstract cannot instantiate
//		car ve = new car();
//		motorcycle mo = new motorcycle();
//		ve.start();
//		mo.start();
		
		// Lab 7
		Lab7_Zoo z = new Lab7_Zoo("Zoo Daifuku", "Osaka Hayabusa") ;
		Reptile crocodile = new Reptile("Little cute");
		crocodile.eat();
		Eagle ea = new Eagle("Daya");
		Lion li = new Lion("Miya");
		ea.makeSound();
		li.makeSound();
		ea.flying();
		z.add_animal(crocodile, ea, li);
		System.out.println(z.Animals);
		z.feed_animal("Ant", "corn", 123.45f);
		z.feed_animal(crocodile, "vege", 123.45f);
		z.list_animal();
	}
}
