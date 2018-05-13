package ramazan.shapes3d;

import ramazan.shapes.Circle;

public class Cylinder extends Circle {
	
	int height;

	public Cylinder(int radius, int height) {
		super(radius);
		this.height = height;

	
	}
	
	public double area(){
		return 2 * super.area() + 2*Math.PI*getRadius();
		
	}

public double volume(){
	return super.area()*height;
}
public String toString(){
	return "radius : " +getRadius() + ", height: "+height;
}

}
