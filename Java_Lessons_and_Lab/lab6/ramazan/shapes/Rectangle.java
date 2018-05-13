package ramazan.shapes;

public class Rectangle {
	
	protected int sideA;// alt klas görür yalnızca // public herkes görebilir 
	protected int sideB;// alt klas görür yalnızca //public herkes görebilir

	public Rectangle(int sideA, int sideB) {
		this.sideA=sideA;
		this.sideB=sideB;

	}

	public double area(){
		return sideA*sideB;
	}
	
	
}
