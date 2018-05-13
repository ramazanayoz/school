

public class ReferenceDemo {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 8;
		
		x = y;
		x++;
		System.out.println("x: " + x+" y:" +y);
		
		Point p1 = new Point(5,5);
		Point p2 = new Point(8,8);
		
		p1 = p2;
		
		p1.xCoordinate++;
		
		System.out.println("x: " + p1.xCoordinate+" y:" +p2.xCoordinate);
		

		x=10;
		increment(x);
		System.out.println(x);
		
		Point p = new  Point(10,10);
		increment(p);
		System.out.println(p.xCoordinate);
		
		change(p);
		System.out.println(p.xCoordinate);
	}
	
	public static void increment(int x){
		x++;
	}
	
	public static void increment(Point p){
		p.xCoordinate++;
	}


	public static void change(Point p){
		p = new Point(5,5);
	}

	
}
