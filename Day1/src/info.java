import java.util.Scanner;
public class info {
	public void display(Student student)
	{
	   System.out.println("------------Student details----------------");
	   System.out.println("ID:"+student.getStud_id());
	   System.out.println("Name of student:"+student.getStud_name());
	   System.out.println("Date of Birth:"+student.getStud_dob());
	}
	public void display(Student[] students) {
		for(int i=0;i<students.length;i++)
		{
			System.out.println("Student Details");
			System.out.println("Student ID:"+students[i].getStud_id());
			System.out.println("Students Name:"+students[i].getStud_name());
			System.out.println("Student DOB:"+students[i].getStud_dob());
		}
	}
	public void display(Course course) {
		System.out.println("---------------Course Details---------------------");
		System.out.println("Id:"+course.getCourse_id());
		System.out.println("Name:"+course.getCourse_name());
		System.out.println("Duration:"+course.getDuration());
		System.out.println("Fees:"+course.getFees());
	}
	
}
