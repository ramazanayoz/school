
public class Main {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(5, 6);

		
		int rectArea = rect1.area();
		System.out.println(rectArea);

		
		Rectangle rect2 = new Rectangle(3, 4);
		System.out.println(rect2.area());
		System.out.println(rect1.area());
		
		
		Rectangle[] rects = new Rectangle[2];
		rects[0] = rect1;
		System.out.println(rects[0].area());
		
		
		Circle circle = new Circle(5);
		System.out.println(circle.area());
		
		
		Circle circle2 = new Circle(6);
		System.out.println(circle.area());
		
	}

}
