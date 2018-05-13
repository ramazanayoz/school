package drawing;

import java.util.ArrayList;
import java.util.Collections;


public class TestComparable {

	public static void main(String[] args) {
		ArrayList<Integer> integers = new ArrayList<>();
		
		integers.add(5);
		integers.add(2);
		integers.add(10);
		integers.add(1);
		
		Collections.sort(integers);
		
		for(int i: integers){
			System.out.println(i);
		}
		
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(new Circle(5,new Point(0, 0)));
		shapes.add(new Circle(3,new Point(0, 0)));
		shapes.add(new Rectangle(5,6,new Point(0, 0)));
		
		Collections.sort(shapes);

		for(Shape s: shapes){
			System.out.println(s.area());
		}
		
		Circle c = new Circle(5,new Point(0, 0));
		Shape s = c;
		Object o = c;
		
		Drawable d = c;
		d.draw();
		Comparable co = c;

		

	}

}
