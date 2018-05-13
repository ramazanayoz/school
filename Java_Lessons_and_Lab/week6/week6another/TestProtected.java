package week6another;

import week6.Rectangle;

public class TestProtected extends Rectangle{

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		//rect.area();

	}
	
	public void doSomething(){
		area();
	}

}
