
public class MyDateTime {

	private MyDate date;
	private MyTime time;
	
	public MyDateTime(MyDate date, MyTime time) {
		this.date = date;
		this.time = time;
	}

	public void incrementDay() {
		date.incrementDay();
		
	}

	public void incrementHour() {
		incrementHour(1);
	}

	public void incrementHour(int i) {
		int dayDiff = time.incrementHour(i);
		date.incrementDay(dayDiff);	
		
	}

	public void decrementHour(int i) {
		int dayDiff = time.decrementHour(i);
		date.decrementDay(-dayDiff);
	}

	public void incrementMinute(int i) {
		int dayDiff = time.incrementMinute(i);
		date.incrementDay(dayDiff);	
	}

	public void decrementMinute(int i) {
		int dayDiff = time.decrementMinute(i);
		date.decrementDay(-dayDiff);	
		
	}

	public void incrementYear() {
		date.incrementYear();
		
	}

	public void incrementMonth() {
		date.incrementMonth();
		
	}

	public void decrementYear(int i) {
		date.decrementYear(i);
		
	}

	public void incrementMonth(int i) {
		date.incrementMonth(i);
		
	}

	public void incrementDay(int i) {
		date.incrementDay(i);
		
	}

	public void decrementMonth(int i) {
		date.decrementMonth(i);
		
	}

	public void decrementDay(int i) {
		date.decrementDay(i);
		
	}

	public void incrementYear(int i) {
		date.incrementYear(i);
		
	}

	public void decrementDay() {
		date.decrementDay();
		
	}

	public void decrementYear() {
		date.decrementYear();
		
	}

	public void decrementMonth() {
		date.decrementMonth();
		
	}

	public boolean isBefore(MyDateTime anotherDateTime) {
		if (date.isBefore(anotherDateTime.date)){
			return true;
		}else if (date.isAfter(anotherDateTime.date)){
			return false;
		}else{
			return time.isBefore(anotherDateTime.time);
		}
	}

	public boolean isAfter(MyDateTime anotherDateTime) {
		if (date.isAfter(anotherDateTime.date)){
			return true;
		}else if (date.isBefore(anotherDateTime.date)){
			return false;
		}else{
			return time.isAfter(anotherDateTime.time);
		}
	}

	public String dayTimeDifference(MyDateTime anotherDateTime) {
		int dayDiff = date.dayDifference(anotherDateTime.date);
		int dayLater = date.isAfter(anotherDateTime.date) ? dayDiff : -dayDiff;

		int minutesLater = time.minLater(anotherDateTime.time) + 24 * 60 * dayLater;
		int minDiff = Math.abs(minutesLater);
			int days =  minDiff / (24 * 60);
			int hours = (minDiff % (24 * 60)) / 60;
			int minutes = minDiff % 60;
			return (days > 0 ? days + " day(s) " : "") + 
					(hours > 0 ? hours + " hour(s) " : "") + 
					(minutes > 0 ? minutes + " minute(s)" : "");
	}
	
	public String toString(){
		return date + " " + time;
	}

}
