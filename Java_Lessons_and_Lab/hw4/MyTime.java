
public class MyTime {

	private int hour;
	private int minute;
	
	public MyTime(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	
	public String toString(){
		return  ((hour <10) ? "0" : "") + hour + ":" +
				((minute <10) ? "0" : "") + minute;
	}

	public int incrementHour() {
		return incrementHour(1);
	}

	public int incrementHour(int i) {
		
		int newHour = (hour + i) % 24;
		int dayDiff = 0;
		if (newHour < 0){
			dayDiff --;
			newHour += 24;
		}
		
		dayDiff += (hour +i ) / 24;
		
		hour = newHour;
		return dayDiff;
	}

	public int incrementMinute(int i) {
		int newMinute = (minute + i) % 60;
		int hourDiff = 0;
		if (newMinute < 0){
			hourDiff --;
			newMinute += 60;
		}
		
		hourDiff += (minute +i ) / 60;
		minute = newMinute;
		return incrementHour(hourDiff);
		
	}

	public int decrementMinute(int i) {
		return incrementMinute(-i);
	}

	public int decrementHour(int i) {
		return incrementHour(-i);
	}
	
	public boolean isBefore(MyTime time){
		return Integer.parseInt(toString().replaceAll(":", "")) <
				Integer.parseInt(time.toString().replaceAll(":", ""));		
	}
	public boolean isAfter(MyTime time){
		return Integer.parseInt(toString().replaceAll(":", "")) >
				Integer.parseInt(time.toString().replaceAll(":", ""));		
	}
	
	public int minLater(MyTime time){
		return (hour * 60 + minute) - (time.hour * 60 + time.minute);
	}
}
