package generics;

import java.util.ArrayList;

import drawing.Circle;
import drawing.Point;
import drawing.Rectangle;
import drawing.Shape;
import drawing.Text;

public class TestGenerics {

	public static void main(String[] args) {

		ArrayList<Integer> lst = new ArrayList<>();

		lst.add(new Integer(5));
		lst.add(new Integer(4));
		lst.add(new Integer(9));
		lst.add(new Integer(9));

		int total = 0;
		for (Integer obj : lst) {
			total += obj.intValue();
		}

		System.out.println(total);

		ArrayList<String> lstStr = new ArrayList<>();
		lstStr.add("9");

		Box<Integer> box = new Box<>();
		box.set(6);

		Integer a = (Integer) box.get();

		System.out.println(a);

		Box<String> boxStr = new Box<>();
		boxStr.set("6");

		Box<Shape> boxShape = new Box<>();
		Circle c = new Circle(5, new Point(6, 6));
		boxShape.set(c);

		PairImpl<Integer, String> p1 = new PairImpl<>(6, "Six");

		PairImpl<Integer, Box<Integer>> p2 = new PairImpl<>(6, new Box<Integer>());
		
		Integer[] ints={};
		
		System.out.println(countGreaterThan(lst.toArray(ints), new Integer(4)));
		
		Shape[] shapes = new Shape[3];
		shapes[0] = new Circle(5,new Point(0, 0));
		shapes[1] = new Circle(3,new Point(0, 0));
		shapes[2] = new Rectangle(5,6,new Point(0, 0));

		
		Shape shape = new Rectangle(7,5,new Point(0, 0));
				
		System.out.println(countGreaterThan(shapes, shape));
		
		Text[] text = new Text[3];
		text[0] = new Text("");

		countGreaterThan(text, new Text("hh"));
		
	}

	public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
		int count = 0;
		for (T e : anArray)
			if (e.compareTo(elem) > 0)
				++count;
		return count;
	}

}
