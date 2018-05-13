package exceptions;

public class Circle {

	int radius;
	
	public Circle(int radius) {
		if (radius <= 0){
			throw new IllegalArgumentException("Radius should be a positive number");
		}
		this.radius = radius;
	}

	public double area() {
		// TODO Auto-generated method stub
		return radius * radius * Math.PI;
	}

}
