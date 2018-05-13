package drawing;

import java.util.ArrayList;

public class Drawing {
	
	private ArrayList<Circle> circles = new ArrayList<>();
	private ArrayList<Rectangle> rectangles = new ArrayList<>();
	private ArrayList<Square> squares = new ArrayList<>();

	
	public double totalArea(){
		double totalArea = 0;
		
		for(Circle circle: circles){
			totalArea += circle.areaOfCircle();
		}

		for(Rectangle rect: rectangles){
			totalArea += rect.areaOfRectangle();}
			
			for(Square sq: squares){
			totalArea += sq.areaOfSquare();
		}
		
		return totalArea;
	}
	
	
	public void draw(){
		for(Circle circle: circles){
			circle.drawCircle();
		}

		for(Rectangle rect: rectangles){
			rect.drawRectangle();
		}
		for(Square sq: squares){
			sq.drawSquare();
		}
		
	}

	
	public void move(int xDistance,  int yDistance){
		for(Circle circle: circles){
			circle.moveCircle(xDistance, yDistance);
		}

		for(Rectangle rect: rectangles){
			rect.moveRectangle(xDistance, yDistance);
		}
		for(Square sq: squares){
			sq.moveSquare(xDistance, yDistance);
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
