public class Course {
     private int courId;
     private String CourName;
     private int duration;
     private double Fees;
	public Course(int courId, String courName, int duration, double fees) {
		super();
		this.courId = courId;
		CourName = courName;
		this.duration = duration;
		Fees = fees;
	}
	public int getCourId() {
		return courId;
	}
	public void setCourId(int courId) {
		this.courId = courId;
	}
	public String getCourName() {
		return CourName;
	}
	public void setCourName(String courName) {
		CourName = courName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getFees() {
		return Fees;
	}
	public double setFees(double fees) { 
		this.getFees();
	
	} 
	
     
}