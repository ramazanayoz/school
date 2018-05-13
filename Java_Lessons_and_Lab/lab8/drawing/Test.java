package drawing;

public class Test {

	public static void main(String[] args) {
		DrawingV3 drawing = new DrawingV3();

		drawing.addShape(new Square(7, new Point(30,30)));

		drawing.addShape(new Circle(5, new Point(5,6)));
		drawing.addShape(new Rectangle(5,8, new Point(20,20)));

		drawing.addShape(new Circle(8, new Point(10,50)));
		drawing.addShape(new Circle(3, new Point(50,40)));

		drawing.addShape(new Rectangle(4,6, new Point(50,20)));
		
		drawing.draw();
		
		System.out.println(drawing.totalArea());
		
		drawing.move(10, 10);

		drawing.draw();

		System.out.println(drawing.totalArea());
		
	}

}
