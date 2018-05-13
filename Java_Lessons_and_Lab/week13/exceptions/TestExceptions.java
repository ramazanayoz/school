package exceptions;

public class TestExceptions {

	public static void main(String[] args) {
		try{
			Circle circle = new Circle(-5);
			System.out.println(circle.area());
			
		}catch(IllegalArgumentException ex){
			//System.out.println(ex.getMessage());
			System.out.println(ex);
			//ex.printStackTrace();
		}

		System.out.println("end of main");
	}

}
