package drawing;

import java.util.ArrayList;

public class DrawingV5 {

	private ArrayList<Drawable> drawables = new ArrayList<>();

	public double totalArea() {
		double totalArea = 0;

		for (Drawable d : drawables) {
			if (d instanceof Shape)
			totalArea += ((Shape)d).area();
		}

		return totalArea;
	}

	public void draw() {
		for (Drawable d : drawables) {
			d.draw();
		}
	}

	public void move(int xDistance, int yDistance) {
		for (Drawable d : drawables) {
			if (d instanceof Shape)
			((Shape)d).move(xDistance, yDistance);
		}

	}

	public void addDrawable(Drawable obj) {
		drawables.add(obj);
	}

}
