package midterm;

public class Question3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++){
			for (int j = 1; j <= 5; j++)
			if ((i == j) || (i + j == 6)){
			System.out.print("X");
			}else{
			System.out.print("_");
			}
			System.out.println("");
			}
	}

}
