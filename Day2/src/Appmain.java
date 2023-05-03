
public class Appmain {

    public static void main(String[] args) {
        AppEngine app = new AppEngine();

        // create a list of students
        Student[] students = app.listOfStudents();

        // create a list of courses
        Course[] courses = app.listOfCourses();

        // enroll a student in a course
        app.enroll(students, courses);

        // print a list of enrollments
        Enroll[] enrollments = app.listOfEnrollments();
        //for each loop
        for (Enroll enrollment : enrollments)
        {
            System.out.println("\nEnrollment Details:");
            System.out.println("Student ID: " + enrollment.getStudent().getId());
            System.out.println("Student Name: " + enrollment.getStudent().getName());
            System.out.println("Course ID: " + enrollment.getCourse().getId());
            System.out.println("Course Name: " + enrollment.getCourse().getName());
            System.out.println("Enrollment Date: " + enrollment.getEnrollmentDate());
        }
    }
}


//check the method one by one 

