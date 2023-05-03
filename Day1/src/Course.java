
public class Course {
	private int Course_id;
	private String Course_name;
	private String Duration;
	private int Fees;
	public Course(int course_id, String course_name, String duration, int fees) {
		super();
		Course_id = course_id;
		Course_name = course_name;
		Duration = duration;
		Fees = fees;
	}
	public int getCourse_id() {
		return Course_id;
	}
	public void setCourse_id(int course_id) {
		Course_id = course_id;
	}
	public String getCourse_name() {
		return Course_name;
	}
	public void setCourse_name(String course_name) {
		Course_name = course_name;
	}
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
	public int getFees() {
		return Fees;
	}
	public void setFees(int fees) {
		Fees = fees;
	}
	

}
