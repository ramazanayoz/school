package exceptions;

public class BClass {

	
	
	public static void methodA() throws AException{
		System.out.println("method A start");
		int a = 1;
		
		if (a == 0){
			throw new AException();
		}
		
		System.out.println("method A end");
		
		
	}
	
	public static void methodB()throws BException{
		System.out.println("method B start");
		String  str = null;
		
		int b = str.length();
		
		if (str == null){
			throw new BException();
		}
		
		System.out.println("method B end");

	}
	
	public static void main(String[] args){
		BClass a = new BClass();
		try{
			a.doSomething();
		}catch (AException | BException aex){
			System.out.println("Recovering Exception "+  aex);
		}
		
		
		
	}
	
	public void doSomething() throws AException, BException{
		
		
		methodA();
		methodB();
	}
	
	
}
