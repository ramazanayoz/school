
public class MethodCallDemo {

	public static void main(String[] args) {
		methodA();
		methodB();
		methodC();
		System.out.println("main method");
	}
	
	public static void methodA() {
		methodB();
		System.out.println("methodA");
	}

	public static void methodB() {
		methodC();
		System.out.println("methodB");
	}

	public static void methodC() {
		methodC();
		System.out.println("methodC");
	}

}
