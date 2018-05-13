package midterm;

public class Question1 {

	public static void main(String[] args) {

		
		int a = 5;
		int b = a++;
		int c = ++a;
		int d = a++ + b-- + c++;
		System.out.println("a= " + a + ", b= " + b + ", c= " + c + ", d= " + d);
		
		a=5;
		b= a++ + a++;
		System.out.println(b);
		
	}

}
