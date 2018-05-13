package ramazan.shapes;
import java.util.ArrayList;

public class Drawing {
	
	

	ArrayList<Circle> circles = new ArrayList<>();	
	ArrayList<Rectangle> rectangles = new ArrayList<>();	

	
	
	
	
	public Drawing() {
		
		
	}
	public void printAreas(){
		for(Circle circle : circles){
			System.out.println(circle.area());
		}
		
	}
		
		public void addCircle(Circle circ){
			circles.add(circ);
		}
		
		public void addRectangle(Rectangle rect){
			rectangles.add(rect);
		}

		
		public void printRadiuses(){
			for(Circle circle : circles)
			System.out.println(circle.radius);
			}
	
	

}
