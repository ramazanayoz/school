package drawing;

public class Circle extends Shape{
	
	private int radius;
	private Point center;
	
	public Circle(int radius, Point  center){
		this.radius = radius;
		this.center = center;
	}

	public void draw(){
		System.out.println("Drawing Circle at " + center + " having radius " + radius);
	}
	
	public double area(){
		return Math.PI * radius * radius;
	}
	
	public void move(int xDistance,  int yDistance){
		center.move(xDistance, yDistance);
	}
}
