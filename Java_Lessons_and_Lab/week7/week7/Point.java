package week7;

public class Point {

	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	

	public String toString(){
		return "x: " + x + ", y: " +y;
	}
	
	public double distanceFromOrigin(){
		return Math.sqrt(x*x + y*y);
	}
	
	public boolean equals(Object obj){
		Point p1 = (Point) obj;
		return x == p1.x && y == p1.y;
	}
	
	public int hashCode(){
		return toString().hashCode();
	}
	
}
