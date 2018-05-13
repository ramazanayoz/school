
public class Point {

	int xCoordinate;
	int yCoordinate;

	static int count = 0;
	int nonStaticCount= 0;
	
	public Point(int x, int y){
		xCoordinate = x;
		yCoordinate = y;
		System.out.println("Point has been created");
		count++;
		nonStaticCount++;
	}
	
	public void move(int xDistance, int yDistance){
		int number = 5;
		xCoordinate += xDistance;
		yCoordinate += yDistance;
	}
	
	public double distanceFromOrigin(){
		return distanceFromPoint(new Point(0,0));
	}
	
	public double distanceFromPoint(Point p){
		int xLength = Math.abs(p.xCoordinate - xCoordinate);
		int yLength = Math.abs(p.yCoordinate - yCoordinate);
		return Math.sqrt(xLength * xLength + yLength * yLength);
		
	}
	
}
