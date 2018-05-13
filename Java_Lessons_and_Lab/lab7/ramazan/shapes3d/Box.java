package ramazan.shapes3d;

import ramazan.shapes.*;
public class Box extends Rectangle {
	
	
int sideC;
public Box(int sideA,int sideB,int sideC){
	super(sideA,sideB);
	this.sideC=sideC;
	
}

public double area(){
	return 2*super.area()+2*sideA*sideC + 2* sideB*sideC;
}

public double volume(){
	return super.area()*sideC;
}

	
	}


	
	

