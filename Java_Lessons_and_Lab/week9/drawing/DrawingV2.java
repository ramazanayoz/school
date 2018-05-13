package drawing;

import java.util.ArrayList;

public class DrawingV2 {

	private ArrayList<Object> shapes = new ArrayList<>();

	public double totalArea() {
		double totalArea = 0;

		for (Object obj : shapes) {

			if (obj instanceof Circle) {
				Circle circle = (Circle) obj;
				totalArea += circle.area();
			} else if (obj instanceof Rectangle) {
				Rectangle rect = (Rectangle) obj;
				totalArea += rect.area();
			} else if (obj instanceof Square) {
				Square sq = (Square) obj;
				totalArea += sq.area();
			}

		}

		return totalArea;
	}

	public void draw() {
		for (Object obj : shapes) {
			if (obj instanceof Circle) {
				Circle circle = (Circle) obj;
				circle.draw();
			} else if (obj instanceof Rectangle) {
				Rectangle rect = (Rectangle) obj;
				rect.draw();
			} else if (obj instanceof Square) {
				Square sq = (Square) obj;
				sq.draw();
			}
		}
	}

	public void move(int xDistance, int yDistance) {
		for (Object obj : shapes) {
			if (obj instanceof Circle) {
				Circle circle = (Circle) obj;
				circle.move(xDistance, yDistance);
			} else if (obj instanceof Rectangle) {
				Rectangle rect = (Rectangle) obj;
				rect.move(xDistance, yDistance);
			} else if (obj instanceof Square) {
				Square sq = (Square) obj;
				sq.move(xDistance, yDistance);
			}
		}

	}

	public void addShape(Object obj) {
		shapes.add(obj);
	}

}
