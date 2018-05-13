



public class FindGreatest {
	
    public static void main(String args[]){
    	
    	int greatest = Integer.parseInt(args[0]); 
    	for (int i = 0 ; i<args.length; i++){	
    		int next = Integer.parseInt(args[i]);
    		if (next > greatest){
    					greatest = next;
    		}
    	}
     
System.out.println(greatest);



 }
 
 }

