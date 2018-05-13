
public class PrePostDemo1 {

	public static void main(String[] args) {
		int result = 5;
		
		int value= ++result;
		
		System.out.println("value: " + value);
		System.out.println("result: " + result);
		
		result = 5;

		value= result++;
		
		System.out.println("value: " + value);
		System.out.println("result: " + result);

	}

}
