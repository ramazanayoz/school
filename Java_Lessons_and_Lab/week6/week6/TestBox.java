package week6;

public class TestBox {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(4, 6);
		rect.setDimension(5, 6);
		
		System.out.println(rect.area());
		System.out.println(rect.perimeter());
		System.out.println(rect);

	}

}
