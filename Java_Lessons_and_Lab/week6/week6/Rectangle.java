package week6;

public class Rectangle {
	protected int length;
	protected int width;
	
	public Rectangle(){
		System.out.println("Creating Rectangle with no paraemeters");
		
	}
	
	public Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	
	public void setDimension(int length, int width){
		this.length = length;
		this.width = width;
	}

	public final int getLength() {
		return length;
	}

	public final int getWidth() {
		return width;
	}

	protected int area(){
		return length * width;
	}
	
	public int perimeter(){
		return 2 * (length + width);
	}
	
	public String toString(){
		return "length = " + length + ", width = " + width;
	}
}
