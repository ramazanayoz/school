
public class Question4 {

	
	public static void main(String[] args) {
	
		System.out.println(sumOfDigits(874));
	}

	private static int sumOfDigits(int i) {
		if (i / 10 == 0){
			return i;
		}
		return sumOfDigits(i/10) + i%10;
		
	}
}
