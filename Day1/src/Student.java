
public class Student {
	private int Stud_id;
	private String Stud_name;
	private String Stud_dob;
	public Student(int stud_id, String stud_name, String stud_dob) {
		super();
		Stud_id = stud_id;
		Stud_name = stud_name;
		Stud_dob = stud_dob;
	}
	public int getStud_id() {
		return Stud_id;
	}
	public void setStud_id(int stud_id) {
		Stud_id = stud_id;
	}
	public String getStud_name() {
		return Stud_name;
	}
	public void setStud_name(String stud_name) {
		Stud_name = stud_name;
	}
	public String getStud_dob() {
		return Stud_dob;
	}
	public void setStud_dob(String stud_dob) {
		Stud_dob = stud_dob;
	}

}
