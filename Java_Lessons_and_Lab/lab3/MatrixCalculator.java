



public class MatrixCalculator {
	
    public static void main(String args[]){
    	
    	int[][] matrixA = {{6, 8, 2}, {9, 5, 11}, {7, 2, 5}};
    	int[][] matrixB = {{4, 6, 3}, {5, 8, 1}, {6, 6, 7}};
    	int[][] result = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    	
    	for (int i=0;i<3;i++){
    		
    		for (int j=0;j<3;j++){
    			result[i][j]=matrixA[i][j]+ matrixB[i][j];
    					System.out.print(result[i][j] + " ");
    			
    		}
    		System.out.println();
    	}
    	
    


 }
 
 }

