package midterm;

public class Question7 {
	public static void main(String[] args) {
		
		System.out.println(hexa(175));
		
	}
	public static String hexa(int number){
		if (number == 15){
			return "F";
		}
		else if(number==14){
				return "E";}
		else if(number==13){
			return "D";}
		else if(number==12){
			return "C";}
		else if(number==11){
			return "B";}
		else if(number==10){
			return "A";}
		
	else if(number < 10){
		return ""+number;
		}
	
	return hexa(number/16)+ hexa (number % 16);
	
}
}