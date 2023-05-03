import java.util.Scanner;
public class LibraryMain {

	public static void main(String[] args) {
		
		Student1 sobj=new Student1(1,"JAVA","Dilip",120,12,"Shubhangi","Pune");
		System.out.println("Student information is:");
		
		Librarian lobj=new Librarian(2,"Python","Sunil",540,167,"Jayesh",8);
		System.out.println("Librarian information is:");
		
		System.out.println("Student roll no is:"+sobj.Stud_rollno);
		System.out.println("Student Name is:"+sobj.Stud_name);
		System.out.println("Students address is:"+sobj.Stud_address);
		
		System.out.println("Librarian id is:"+lobj.Librarian_id);
		System.out.println("Librarian name is:"+lobj.Librarian_name);
		System.out.println("Librarian working hr:"+lobj.Nohr);
	}
	
}


