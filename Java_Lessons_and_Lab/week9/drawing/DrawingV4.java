package drawing;

import java.util.ArrayList;

public class DrawingV4 {

	private ArrayList<Shape> shapes = new ArrayList<>();
	private ArrayList<Text> texts = new ArrayList<>();

	public double totalArea() {
		double totalArea = 0;

		for (Shape shape : shapes) {
			totalArea += shape.area();
		}

		return totalArea;
	}

	public void draw() {
		for (Shape shape : shapes) {
			shape.draw();
		}
		for (Text text : texts) {
			text.draw();
		}
	}

	public void move(int xDistance, int yDistance) {
		for (Shape shape : shapes) {
			shape.move(xDistance, yDistance);
		}

	}

	public void addShape(Shape obj) {
		shapes.add(obj);
	}

}
