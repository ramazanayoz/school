package drawing;

import java.util.ArrayList;

public class DrawingV2 {
	
	private ArrayList<Object> shapes = new ArrayList<>();
	

	
	public double totalArea(){
		double totalArea = 0;
		
		for(Object obj: shapes){
			if(obj instanceof Circle){
				Circle circ = (Circle) obj;
				totalArea += circ.areaOfCircle();

			}
			else if
				   (obj instanceof Rectangle){
					Rectangle rect = (Rectangle) obj;
					totalArea += rect.areaOfRectangle();

			}
		else if
					   (obj instanceof Square){
						   Square sq = (Square) obj;
							totalArea += sq.areaOfSquare();

				}}
		
		return totalArea;
	}
	
	
	public void draw(){
		for(Object obj: shapes){
		if(obj instanceof Circle){
			Circle circ = (Circle) obj;
			circ.drawCircle();

		}
		else if
			   (obj instanceof Rectangle){
				Rectangle rect = (Rectangle) obj;
				rect.drawRectangle();

		}
	else if(obj instanceof Square){
			Square sq = (Square) obj;
			 sq.drawSquare();

			}
		
	}
	}
	
	public void move(int xDistance,  int yDistance){
		for(Object obj: shapes){
		if(obj instanceof Circle){
			Circle circ = (Circle) obj;
			circ.moveCircle(xDistance, yDistance);

		}
		else if
			   (obj instanceof Rectangle){
				Rectangle rect = (Rectangle) obj;
				rect.moveRectangle(xDistance, yDistance);;

		}
	else if(obj instanceof Square){
			Square sq = (Square) obj;
			 sq.moveSquare(xDistance, yDistance);;

			}
		
	}
	}
	
	public void addShape(Shape obj){
		shapes.add(obj);
	}
	

	
}
