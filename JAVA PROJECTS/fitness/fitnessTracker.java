package fitness;

public class fitnessTracker {
	private String activity;
	private int minutes;
	private String date; 	
	
	public void setactivity(String activity) {
		this.activity = activity;
		 
	}
	String getactivity() {
		return activity;
	}
	public void setminutes(int minutes) {
		this.minutes = minutes;
		 
	}
	int getminutes() {
		return minutes;
	}
	
	public void setdate(String date) {
		this.date = date;
		 
	}
	String getdate() {
		return date;
	}
	public fitnessTracker() {
		activity = "Running";
		minutes = 0;
		date = "1 JANUARY 2023";
		
	}
	
	public fitnessTracker(String activity, int minutes, String date) {
		this.activity = activity;
		this.date = date;
		this.minutes = minutes;
	}




}
