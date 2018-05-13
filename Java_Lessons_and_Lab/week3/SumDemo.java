
public class SumDemo {

	public static void main(String[] args) {
		int result = sumRec(10);
		//sumLoop(10);
		System.out.println(result);
		if (result ==50)
			return;
		System.out.println(result);

	}

	public static int sumLoop(int number) {
		int sum = 0;
		for (int i=0; i<=number; i++){
			sum+=i;
		}
		return sum;
		
	}

	
	public static int sumRec(int number) {
		if (number == 0){
			return 0;
		}
		return number + sumRec(number-1);
	}
	
	
	public static int factorial(int n){
		if (n == 0){
			return 1;
		}
		return n * factorial(n-1);
	}
}
