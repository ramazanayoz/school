package midterm;

public class Question6 {

	public static void main(String[] args) {
		System.out.println(function(6));
	}
		
		
		public static int function(int n) {
			if(n == 0)
			return 0;
			else if(n == 1)
			return 1;
			else
			return function(n - 1) + 2 * function(n - 2);
			}
	}


