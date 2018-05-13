package drawing;

public class Point {
	
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void move (int xDistance,  int yDistance){
		x += xDistance;
		y += yDistance;
	}

	public String toString(){
		return "x = " + x + ", y = " + y;
	}
}
