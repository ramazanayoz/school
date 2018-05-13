package drawing;

public class Test {

	public static void main(String[] args) {
		DrawingV5 drawing = new DrawingV5();
		
		
		drawing.addDrawable(new Square (7, new Point(30,30)));
		
		drawing.addDrawable(new Circle(5, new Point(5,6)));
		drawing.addDrawable(new Rectangle(5,8, new Point(20,20)));

		drawing.addDrawable(new Circle(8, new Point(10,50)));
		drawing.addDrawable(new Circle(3, new Point(50,40)));

		drawing.addDrawable(new Rectangle(4,6, new Point(50,20)));
		
		drawing.addDrawable(new Text("abc"));
		
		drawing.draw();
		
		System.out.println(drawing.totalArea());
		
		drawing.move(10, 10);

		drawing.draw();

		System.out.println(drawing.totalArea());
		
	}

}
