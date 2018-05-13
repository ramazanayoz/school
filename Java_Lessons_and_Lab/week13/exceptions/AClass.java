package exceptions;

public class AClass {

	public static void method2()  throws BException {
		System.out.println("method A start");
		int a = 4;
		try {
			if (a == 0) {
				throw new AException();
			} else if (a == 1) {
				throw new BException();
			} else if (a == 2) {
				throw new IllegalArgumentException();
			}else{
				throw new NullPointerException();
			}

		} catch (AException aex) {
			System.out.println("Recovering Exception: " + aex);

		}
		System.out.println("method A end");

	}

	public static void method1() throws BException {
		System.out.println("method B start");
		try{
			System.out.println("calling method 2 ");
			method2();
			System.out.println("method 2 called");
			
		}catch(IllegalArgumentException ex){
			System.out.println("Recovering Exception: " + ex);
		}catch(BException bex){
			System.out.println("Recovering some part of: " + bex);
			throw bex;
		}catch(NullPointerException nex){
			System.out.println("Recovering Exception: " + nex);
			throw new BException("Null pointer exception occurred", nex);
		}
		
		System.out.println("method B end");

	}

	public static void main(String[] args) {
		System.out.println("main start");

//		try {
//			method1();
//		} catch (BException e) {
//			e.printStackTrace();
//			System.out.println("Recovering Exception: " + e);		
//		}
//	
//		System.out.println("main end");

		finalyDemo();
		
	}


	public static void finalyDemo(){
		String str2 = null;
		if (str2 == null){
			return;
		}
		
		try{
			String str = null;
			if (str == null){
				return;
			}
			int a = str.length();
			System.out.println("length assigned successfuly");
			
		}catch(Throwable iax){
			System.out.println("Recovering " + iax);
			return;
			//throw new NullPointerException();
		}/*catch(Exception ex){
			
		}*/
		finally{
			System.out.println("in finally");
		}
		
		System.out.println("finally demo ends");
	}
	
}
