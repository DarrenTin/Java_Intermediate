package project1;

abstract class vehicle{
	abstract void start();
}

public class Lab6_Vehicle {

}

class car extends vehicle { // concrete class
	// "start" from abstract class must be used
	public void start() {
		System.out.println("Car is on the way!");
	}
}

class motorcycle extends vehicle{
	public void start() {
		System.out.println("Meat is surrounding the iron!");
	}
}

