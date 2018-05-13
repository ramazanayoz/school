package midterm;

public class Question4 {
	public static void main(String[] args) {

	
	int[] primeNumbers = new int[50];
	//initialize ilk değer atamak demek
	//initalize checking from 2 
	int number = 2;
	//initalize primes found to 0
	int primesFound = 0;
	//while 50 primes not found
	while (primesFound < 50){
		
		boolean isPrime = true;
		//check the next number if it is prime
		for(int i =2; i<number;i++){
			
			if(number % i ==0){
				isPrime = false;
				break;
			}
			
		}
		
		
		
		//if the next number is prime
		if (isPrime){
			//add the number to the array
		
		primeNumbers[primesFound] = number;
		primesFound++;
		}
		number++;
	}
	for(int i=0; i< 50; i++)
		System.out.print(primeNumbers[i] + " ");
	
}}
