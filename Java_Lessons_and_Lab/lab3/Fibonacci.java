public class Fibonacci {
	
    public static void main(String args[]){
    	int limit = Integer.parseInt(args[0]); 
    	int element = 0;
    	int nextElement = 1;
		System.out.print(element+", ");
		System.out.print(nextElement+"");

    	while (element + nextElement < limit){
    		System.out.print(", " );

    		int total = element + nextElement;
    		System.out.print(total+"" );

    		element = nextElement;
    		nextElement = total;

    		
    	}
    	




 }
 
 }

