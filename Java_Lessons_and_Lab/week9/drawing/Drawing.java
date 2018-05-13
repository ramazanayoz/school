package drawing;

import java.util.ArrayList;

public class Drawing {
	
	private ArrayList<Circle> circles = new ArrayList<>();
	private ArrayList<Rectangle> rectangles = new ArrayList<>();
	private ArrayList<Square> squares = new ArrayList<>();
	
	public double totalArea(){
		double totalArea = 0;
		
		for(Circle circle: circles){
			totalArea += circle.area();
		}

		for(Rectangle rect: rectangles){
			totalArea += rect.area();
		}
		
		for(Square sq: squares){
			totalArea += sq.area();
		}
		
		return totalArea;
	}
	
	
	public void draw(){
		for(Circle circle: circles){
			circle.draw();
		}

		for(Rectangle rect: rectangles){
			rect.draw();
		}
		
		for(Square sq: squares){
			sq.draw();
		}
	}

	
	public void move(int xDistance,  int yDistance){
		for(Circle circle: circles){
			circle.move(xDistance, yDistance);
		}

		for(Rectangle rect: rectangles){
			rect.move(xDistance, yDistance);
		}
		
		for(Square sq: squares){
			sq.move(xDistance, yDistance);
		}
		
	}
	
	public void addCircle(Circle circle){
		circles.add(circle);
	}
	
	public void addRectangle(Rectangle rect){
		rectangles.add(rect);
	}
	
	public void addSquare(Square sq){
		squares.add(sq);
	}


}
