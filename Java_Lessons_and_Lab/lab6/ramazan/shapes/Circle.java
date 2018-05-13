package ramazan.shapes;

public class Circle {
	public int radius;
	//problem int radius; // aynı pakettekiler görür
	//problem private int radius;



	public Circle(int radius) {
		this.radius = radius;
		
		
	}
	public double area(){
		return Math.PI* radius*radius;
	}
	public int getRadius(){
		return radius;
		
	}

}
