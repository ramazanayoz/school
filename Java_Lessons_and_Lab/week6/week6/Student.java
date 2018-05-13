package week6;

public class Student extends Person {
	double gpa;

	
	public String toString(){
		return super.toString() +", gpa = " + gpa + isAlive;
	}
	
}
