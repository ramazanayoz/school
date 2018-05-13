package ramazan.main;

import ramazan.shapes.*;
import java.util.ArrayList;
//import ramazan.shapes.Circle;
//import ramazan.shapes.Rectangle;
//import java.lang.String;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle(5);
		System.out.println(circle.area());
		System.out.println(circle.radius);

		
    Rectangle rect = new Rectangle(5,6);
	System.out.println(rect.area());
	
	ArrayList<Circle> circles = new ArrayList();
	circles.add(circle);
	circles.add(new Circle(6));
	circles.add(new Circle(7));
	
	System.out.println();
	Drawing drawing = new Drawing();

	for(int i =0;i<circles.size();i++){
		Circle circ = circles.get(i);
		drawing.addCircle(circ);
	}
	drawing.printAreas();
	System.out.println();
	drawing.printRadiuses();
	
	}

}
