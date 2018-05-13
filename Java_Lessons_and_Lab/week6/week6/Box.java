package week6;

public class Box extends Rectangle{
	int height;

	public Box(){
		System.out.println("Creating Box with no paraemeters");
	}
	
	public Box(int length, int width, int height){
		super(length, width);
		System.out.println("Creating Box with paraemeters");
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setDimension(int length, int width, int height){
		super.setDimension(length, width);
		this.height = height;
	}
	
	
	 public int area(){
		return 2 * super.area() + 2 * getLength() * height + 2 * getWidth() * height;

	}
	

	public int volume(){
		return super.area()  * height;
	}

	public String toString(){
		return super.toString() + ", height = " + height;
	}
	
}
