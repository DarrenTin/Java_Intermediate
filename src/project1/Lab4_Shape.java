package project1;

interface Shape{
	double calculateArea();
	double calculatePerimeter();
}

class Lab4_Shape implements Shape {
	public double calculateArea() {
		return 0;
	}

	public double calculatePerimeter() {
		return 0;
	}
}

class Circle extends Lab4_Shape{
	private int radius = 10;
	
	public double calculateArea() {
		return radius * radius * 3.142;
	}

	public double calculatePerimeter() {
		return radius * 2 * 3.142;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}

class Rectangle extends Lab4_Shape{
	private int length = 10;
	private int width = 10;

	
	public double calculateArea() {
		return length * width;
	}

	public double calculatePerimeter() {
		return 2 * (length + width);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	
}