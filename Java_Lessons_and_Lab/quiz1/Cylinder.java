
public class Cylinder {

	int radius;
	int height;
	
	public Cylinder(int radius, int height) {
		this.radius = radius;
		this.height = height;
	}
	
	public double volume(){
		return 3.14 * radius * radius * height;
	}
	
}
