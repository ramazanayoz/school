
public class Question2 {

	public static void main(String[] args) {
		int x = 10, y =0;
		while (x > 0){
			y =0;
			while (y < 10) {
				System.out.println("x = " + x + " y = "+ y);
				y += 3;
			}
			x -=5;
		}			
	}

}
