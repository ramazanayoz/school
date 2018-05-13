
public class Rectangle {
<<<<<<< HEAD
	
    	
    	
    	
    	
    	int sideA;
    	int sideB;
    	
    	public Rectangle(int a, int b){
    		sideA =a;
    		sideB =b;

    		System.out.println("Creating Rectangle");
    	}
    	
    	public int area() {
    		
    	   int  result = sideA*sideB;
    	   return result;
    	    
    		
    		
    	}
    	
    	public int perimeter(){
    		return 2 * (sideA + sideB);
    		
    	}
    	
    	
    	



=======

	int sideA;
	int sideB;
	
	public Rectangle(int a, int b){
		sideA = a;
		sideB = b;
		System.out.println("creating Rectangle Object");
	}
	
	
	public int area(){
		int result = sideA * sideB;
		return result;
	}
	
	public int perimeter(){
		return 2 * (sideA + sideB);
	}
	
>>>>>>> remotes/OzgurKilic/lab/master
}
