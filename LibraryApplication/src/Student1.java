
public class Student1 extends Book{
	public int Stud_rollno;
	public String Stud_name;
	public String Stud_address;
	public Student1(int book_id, String book_name, String book_author, int book_prize, int stud_rollno,
			String stud_name, String stud_address) {
		super(book_id, book_name, book_author, book_prize);
		Stud_rollno = stud_rollno;
		Stud_name = stud_name;
		Stud_address = stud_address;
	}
	public int getStud_rollno() {
		return Stud_rollno;
	}
	public void setStud_rollno(int stud_rollno) {
		Stud_rollno = stud_rollno;
	}
	public String getStud_name() {
		return Stud_name;
	}
	public void setStud_name(String stud_name) {
		Stud_name = stud_name;
	}
	public String getStud_address() {
		return Stud_address;
	}
	public void setStud_address(String stud_address) {
		Stud_address = stud_address;
	}
	
	
	

}
