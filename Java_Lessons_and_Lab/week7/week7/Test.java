package week7;

public class Test {

	public static void main(String[] args) {
		Point p = new Point(4,5);
		Object obj = p;
		
		System.out.println(obj.getClass());
		
		Point p1 = (Point)obj;

		if(obj instanceof String){
			String s = (String) obj;
		}
		
		p.distanceFromOrigin();
		System.out.println(obj.toString());
		
		if (obj.equals(p)){
			System.out.println("Same object");
		}
		
		Point p2 = new Point(4,5);
		
		p2 = p1;
		
		if (p2.equals(obj)){
			System.out.println("p2 and p have same values");
		}
		
		System.out.println(p2.getClass());
		
		
		Circle circle = new Circle(5);
		
		
		Shape shape = circle;
		
		shape.area();
		
		//Shape sh = new Shape(); not valid
		
		
	}

}
