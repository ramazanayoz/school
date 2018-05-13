package drawing;

public class Square extends Shape {
	
	private int side;
	private Point topLeft;
	
	public Square(int side, Point  topLeft){
		this.side= side;
		this.topLeft = topLeft;
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
