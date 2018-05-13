<<<<<<< HEAD
=======

>>>>>>> remotes/OzgurKilic/lab/master
public class TestMyDate {


	public static void main(String[] args) {
		
		MyDate date = new MyDate(28,2,2017);
		
		String strRep = date.toString();
		assertEquals(strRep, "2017-02-28");
		//Expected output: 2017-02-28
		
		date.incrementDay();
		strRep = date.toString();
		assertEquals(strRep, "2017-03-01");
		//Expected output: 2017-03-01
		
		
		date.incrementYear(3);
		strRep = date.toString();
		assertEquals(strRep, "2020-03-01");
		//Expected output: 2020-03-01
		
		date.decrementDay();
		strRep = date.toString();
		assertEquals(strRep, "2020-02-29");
		//Expected output: 2020-02-29
		
		date.decrementYear();
		strRep = date.toString();
		assertEquals(strRep, "2019-02-28");
		//Expected output: 2019-02-28
		
		date.decrementMonth();
		strRep = date.toString();
		assertEquals(strRep, "2019-01-28");
		//Expected output: 2019-01-28		

		
		date.incrementDay(3);
		strRep = date.toString();
		assertEquals(strRep, "2019-01-31");
		//Expected output: 2019-01-31		
		
		date.decrementMonth(2);
		strRep = date.toString();
		assertEquals(strRep, "2018-11-30");
		//Expected output: 2018-11-30		
		
		date.decrementDay(30);
		strRep = date.toString();
		assertEquals(strRep, "2018-10-31");
		//Expected output: 2018-10-31			

		date.incrementMonth(16);
		strRep = date.toString();
		assertEquals(strRep, "2020-02-29");
		//Expected output: 2020-02-29		
	
		date.decrementYear(4);
		strRep = date.toString();
		assertEquals(strRep, "2016-02-29");
		//Expected output: 2016-02-29
	
		date.incrementMonth();
		strRep = date.toString();
		assertEquals(strRep, "2016-03-29");
		//Expected output: 2016-03-29		

		date.incrementYear();
		strRep = date.toString();
		assertEquals(strRep, "2017-03-29");
		//Expected output: 2017-03-29		
		
		MyDate anotherDate = new MyDate(28,2,2017);
		
		boolean before = date.isBefore(anotherDate);
		System.out.print(date.toString()+ " is before " + anotherDate.toString()+ " : " + before);
		assertEquals(before, false);
		//Expected output: 2017-03-29 is before 2017-02-28 : false		
		
		boolean after = date.isAfter(anotherDate);
		System.out.print(date.toString()+ " is after " + anotherDate.toString()+ " : " + after);
		assertEquals(after, true);
		//Expected output: 2017-03-29 is after 2017-02-28 : true
		
		int dayDiff = date.dayDifference(anotherDate);
		System.out.print("Day difference between " + date.toString()+ " and " + anotherDate.toString()+ " is " + dayDiff);
		assertEquals(dayDiff, 29);
		//Expected output: Day difference between 2017-03-29 and 2017-02-28 is 29

		MyDate date1 = new MyDate(28,2,2017);
		MyDate date2 = new MyDate(28,2,2018);
		dayDiff = date2.dayDifference(date1);
		System.out.print("Day difference between " + date2.toString()+ " and " + date1.toString()+ " is " + dayDiff);
		assertEquals(dayDiff, 365);

		before = date1.isBefore(date2);
		System.out.print(date1.toString()+ " is before " + date2.toString()+ " : " + before);
		assertEquals(before, true);
		//Expected output: 2017-02-28 is before 2018-02-28 : true		

		before = date1.isAfter(date2);
		System.out.print(date1.toString()+ " is after " + date2.toString()+ " : " + before);
		assertEquals(before, false);
		//Expected output: 2017-02-28 is before 2018-02-28 : true		

		date1 = new MyDate(31,12,2016);
		date1.incrementDay();
		strRep = date1.toString();
		assertEquals(strRep, "2017-01-01");
		//Expected output: 2017-01-01
		
		date2 = new MyDate(1,1,2016);
		dayDiff = date2.dayDifference(date1);
		System.out.print("Day difference between " + date2.toString()+ " and " + date1.toString()+ " is " + dayDiff);
		assertEquals(dayDiff, 366);
		
		
		
	}
	
	
	private static void assertEquals(int result, int expected) {
		System.out.println(result == expected ? " - success" : " - fail: " + expected + " expected!");
		
	}


	private static void assertEquals(boolean result, boolean expected) {
		System.out.println(result == expected ? " - success" : " - fail: " + expected + " expected!");
		
	}


	public static void assertEquals(String str1, String str2){
		System.out.print(str1);
		System.out.println(str1.equals(str2) ? " - success" : " - fail: " + str2 + " expected!");
		
	}


}
