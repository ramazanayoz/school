
public class PrimeDemo {

	public static void main(String[] args) {
		int max = 100;
		for (int number = 2; number < max; number++){
			int divisor =2;
			boolean isPrime = true;
			while((divisor< number) && isPrime){
				if (number%divisor ==0){
					isPrime = false;
				}
				divisor++;
			}
			if (isPrime){
				System.out.print(number+ " ");
			}
			
		}

	}

}
