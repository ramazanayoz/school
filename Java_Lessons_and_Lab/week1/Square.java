public class Square {
	public static int printSquare(int x) {
		int y= 8;
		return x*y;
	}

	public static void main(String[] args) {
		
		int value = 2;
		int x= 4;
		System.out.println(printSquare(value));
		System.out.println(printSquare(3));
		System.out.println(printSquare(value * 2));
	}
}