package week7;

public class Circle extends Shape {

	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		
		return Math.PI * radius * radius;
	}

}
