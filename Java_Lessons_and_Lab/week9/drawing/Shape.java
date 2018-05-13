package drawing;

public abstract class Shape implements Drawable, Comparable<Shape> {

	public abstract double area();

	public void move(int xDistance, int yDistance) {

	}

	@Override
	public int compareTo(Shape o) {
		return (int) (area() - o.area());
	}

	public <U extends Shape> void printArea(U s) {
		System.out.println("Area: " + s.area());
	}

}
