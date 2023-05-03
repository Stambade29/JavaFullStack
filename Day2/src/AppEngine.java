import java.util.Scanner;

public class AppEngine {

	public void introduce(Course course) {
		System.out.println("Course Details:");
        System.out.println("ID: " + course.getId());
        System.out.println("Name: " + course.getName());
        System.out.println("Duration: " + course.getDuration());
        System.out.println("Fees: " + course.getFees());		
    }

   public void register(Student student) {
	   System.out.println("Student Details:");
	   System.out.println("ID: " + student.getId());
	   System.out.println("Name: " + student.getName());
	   System.out.println("Date of Birth: " + student.getDateOfBirth());    
    }

   public Student[] listOfStudents() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter The Number Of Students : ");
	    int n = sc.nextInt();
	    sc.nextLine(); // consume the newline character
	    Student[] students = new Student[n];
	    
	    for (int i = 0; i < students.length; i++) {
	        System.out.println("Enter information for student " + (i + 1) + ":");
	        System.out.println("ID:");
	        int id = sc.nextInt();
	        sc.nextLine(); // consume the newline character
	        System.out.println("Name:");
	        String name = sc.nextLine();
	        System.out.println("Date of birth (YYYY-MM-DD):");
	        String dob = sc.nextLine();
	        students[i] = new Student(id, name, dob);
	    }
	    return students;
	}

	public Course[] listOfCourses() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number of courses:");
	    int n = sc.nextInt();
	    sc.nextLine(); // consume the newline character
	    Course[] courses = new Course[n];
	    
	    for (int i = 0; i < courses.length; i++) {
	        System.out.println("Enter information for Course " + (i + 1) + ":");
	        System.out.println("ID:");
	        int id = sc.nextInt();
	        sc.nextLine(); // consume the newline character
	        System.out.println("Name:");
	        String name = sc.nextLine();
	        System.out.println("Duration in months:");
	        int duration = sc.nextInt();
	        System.out.println("Fees:");
	        double fees = sc.nextDouble();
	        
	        courses[i] = new Course(id, name, duration, fees);
	    }
	    return courses;
	}



   public void enroll(Student[] students, Course[] courses) {
	    Scanner sc = new Scanner(System.in);

	    // Display a list of students
	    System.out.println("List of Students:");
	    for (int i = 0; i < students.length; i++) {
	        System.out.println("\n\t Student Id : "+students[i].getId()+"\n\t Student Name : " +students[i].getName()+"\n\t Student DOB : "+students[i].getDateOfBirth());
	    }
	    
	    // Display a list of courses
	    System.out.println("List of Courses:");
	    for (int i = 0; i < courses.length; i++) {
	        System.out.println("\n\t Course Id : "+courses[i].getId()+"\n\t Course Name : " +courses[i].getName()+"\n\t Course Duration : "+courses[i].getDuration()+"\n\t Course Fees : "+courses[i].getFees());
	    }
	    
	    // Prompt user to enter student and course IDs and enrollment date
	    System.out.print("Enter student ID: ");
	    int studentId = sc.nextInt();
	    System.out.print("Enter course ID: ");
	    int courseId = sc.nextInt();
	    System.out.print("Enter enrollment date: ");
	    String enrollmentDate = sc.next();
	    
	    // Look up student and course objects from the arrays
	    Student student = null;
	    for (int i = 0; i < students.length; i++) {
	        if (students[i].getId() == studentId) {
	            student = students[i];
	            break;
	        }
	    }
	    if (student == null) {
	        System.out.println("Invalid student ID.");
	        return;
	    }
	    
	    Course course = null;
	    for (int i = 0; i < courses.length; i++) {
	        if (courses[i].getId() == courseId) {
	            course = courses[i];
	            break;
	        }
	    }
	    if (course == null) {
	        System.out.println("Invalid course ID.");
	        return;
	    }
	    
	    // Create the enrollment object with valid student, course, and enrollment date
	    Enroll enrollment = new Enroll(student, course, enrollmentDate);
	    
	    // Print enrollment details
	    System.out.println("Enrollment Details:");
	    System.out.println("Student ID: " + enrollment.getStudent().getId());
	    System.out.println("Student Name: " + enrollment.getStudent().getName());
	    System.out.println("Course ID: " + enrollment.getCourse().getId());
	    System.out.println("Course Name: " + enrollment.getCourse().getName());
	    System.out.println("Enrollment Date: " + enrollment.getEnrollmentDate());
	}


   public Enroll[] listOfEnrollments() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number of enrollments: ");
	    int numEnrollments = sc.nextInt();

	    Enroll[] enrollments = new Enroll[numEnrollments];
	    int index = 0;

	    // Loop through each student
	    for (Student student : listOfStudents())  //public Student[] listOfStudents() calling this method
	    	{
	        // Loop through each course
	        for (Course course : listOfCourses()) //public Course[] listOfCourses() calling this method
	        {
	          
	                // Create a new Enroll object for the enrollment
	        		System.out.println("Enter Course Enrollment Date (YYYY-MM-DD) :");
	                String enrollmentDate = sc.next(); // Set the enrollment date 
	                enrollments[index] = new Enroll(student, course, enrollmentDate);
	                index++;
	        }
	        
	    }

	    return enrollments;
	}



}