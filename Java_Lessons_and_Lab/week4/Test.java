
public class Test {

	public static void main(String[] args) {
		
		Point.count = 5;
		
		
		Point point1 = new Point(5,6);
		
		Point point2 = new Point(2,3);
		
		
		
		point1.move(5, 5);
		
		System.out.println("X is " + point1.xCoordinate + 
				" Y is " + point1.yCoordinate);
		System.out.println("X is " + point2.xCoordinate + 
				" Y is " + point2.yCoordinate);

		System.out.println(point1.distanceFromOrigin());
		
		MyRectangle rect = new MyRectangle(point1, 5, 6);
		
		Point p3= rect.bottomRight();
		
		System.out.println("X is " + p3.xCoordinate + 
				" Y is " + p3.yCoordinate);

	
		System.out.println(Point.count);
		System.out.println(p3.count);
		
	}

}
