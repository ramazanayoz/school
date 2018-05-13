package exceptions;

public class Test {

	public static void main(String[] args) {

		try {
			performCalculations2();
		} catch (InvalidOperatorException e) {
			System.out.println(e.getMessage());
		}
		
//		try {
//			
//			System.out.println(calc.add(5, "+", 3));
//		
//		} catch (InvalidOperatorException e) {
//			System.out.println(e.getMessage());
//		}
//
//		try {
//		
//			System.out.println(calc.add(5, "p", 3));
//		
//		} catch (InvalidOperatorException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	
	public static void performCalculations() throws InvalidOperatorException{
		Calculator calc = new Calculator();
		

		System.out.println(calc.add(5, "+", 3));
			System.out.println(calc.add(5, "p", 3));
			
		
	}
	
	public static void performCalculations2() throws InvalidOperatorException{
		Calculator calc = new Calculator();
		System.out.println(calc.add(5, "/", 0));
	}

	public static void method2() throws Exception {
		System.out.println("method2");
		
			throw new Exception();
	}

	public static void method1() throws Exception{
		
			method2();
		
	}


}
