package drawing;

public class Rectangle extends Shape{
	
	private int width;
	private int length;
	
	Point topLeft;
	
	public Rectangle(int width, int length, Point topLeft){
		this.width = width;
		this.length = length;
		this.topLeft = topLeft;
	}

	public void draw(){
		System.out.println("Drawing Rectangle at " + topLeft + " having width  and length: " + width + " and " + length);
	}
	
	
	public double area(){
		return width * length;
	}
	
	public void move(int xDistance,  int yDistance){
		topLeft.move(xDistance, yDistance);
	}	
}
