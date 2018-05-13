
public class MyRectangle {

	Point topLeft;
	
	int length;
	
	int height;
	
	public MyRectangle(Point p, int l, int h){
		topLeft = p;
		height = h;
		length = l;
	}
	
	public Point bottomRight(){

		int x = topLeft.xCoordinate + length;
		int y = topLeft.yCoordinate - height;
		Point p = new Point(x,y);
		return p;
	}
	
}
