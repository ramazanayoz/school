package drawing;

import java.util.ArrayList;

public class DrawingV3 {
	
	private ArrayList<Shape> shapes = new ArrayList<>();
	

	
	public double totalArea(){
		double totalArea = 0;
		
		for(Shape shape: shapes){
				totalArea += shape.area();
}
		
		return totalArea;
	}
	
	
	public void draw(){
		for(Shape shape: shapes){
			shape.draw();
}
		}
	
	
	public void move(int xDistance,  int yDistance){
		for(Shape shape: shapes){
			shape.move(xDistance, yDistance);
		}

	}
	
	public void addShape(Shape obj){
		shapes.add(obj);
	}
	

	
}
