
public class TestInstanceVar {

	
	public static void main(String[] args){

		System.out.println(MyDate.inLeapYear(2004));
		
		//System.out.println(MyDate.getMaxDayOfAMonth(2, 2016));
		
		
		int x;
		
		for (int i = 0; i<12; i++){
			System.out.print(MyDate.maxDays[i]  + " ");
		}
		System.out.println();
		
		MyDate date1  = new MyDate(2,2,2017);
		date1.maxDays[1]= 28;

		date1.incrementDay();

		
		System.out.println(date1.getMonth());
		//date1.month = 5;
		
		MyDate date2  = new MyDate(23,2,2017);
		
		System.out.println(date1.getDay());
		
		
		for (int i = 0; i<12; i++){
			System.out.print(date1.maxDays[i]  + " ");
		}

		System.out.println();
		for (int i = 0; i<12; i++){
			System.out.print(date2.maxDays[i]  + " ");
		}

		
	}
}
