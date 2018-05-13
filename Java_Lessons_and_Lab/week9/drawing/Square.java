package drawing;

public class Square extends Shape{
	
	private int side;
	private Point topLeft;
	
	public Square(int radius, Point  center){
		this.side = radius;
		this.topLeft = center;
	}

	public void draw(){
		System.out.println("Drawing Square at " + topLeft + " having side " + side);
	}
	
	public double area(){
		return side * side;
	}
	
	public void move(int xDistance,  int yDistance){
		topLeft.move(xDistance, yDistance);
	}
}
