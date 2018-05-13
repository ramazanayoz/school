

public class Recursice {

	public static void main(String[] args) {
		System.out.println(i2b(79));
		System.out.println(i2b(78));
		System.out.println(b2i(1001111));
		System.out.println(b2i("1001110"));

	}
	
	
	public static String i2b( int n){
		if (n < 2){
			return "" +n%2;
		}
		
		return i2b(n/2) + n%2;
	}
	
	
	public static int b2i(int b){
		if (b < 10){
			return b;
		}
		return 2 * b2i(b/10) + b%10;
	}
	
	
	public static int b2i(String b){
		if (b.length() == 1){
			return Integer.parseInt(b);
		}
		int lastDigit = b.endsWith("1")? 1 :0;
		
		return 2 * b2i(b.substring(0, b.length() -1)) + lastDigit;
	}
	
	

}
