package ramazan.main;
import ramazan.shapes.Circle;
import ramazan.shapes3d.*;

public class Test3D {


	public static void main(String[] args) {
		Circle circ = new Circle(5);
		System.out.println("Area of Circle: "+circ.area());
		
		
		
		
Cylinder cylinder = new Cylinder(5,6);
System.out.println("Area of cylinder: "+ cylinder.area());
System.out.println("Volume of cylinder: "+ cylinder.volume());

		Circle circle = cylinder;
		//circle.volume();
		circle.area();
		
		System.out.println(circle.area());
		
		Object obj = cylinder;
		System.out.println(obj.toString());
		Box box = new Box(4,5,6);
		System.out.println(box.area());
		System.out.println(box.volume());

	}

}
