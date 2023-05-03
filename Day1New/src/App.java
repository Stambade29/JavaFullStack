import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	    scenario1();
        scenario2();
        scenario3();
	}
    private static void scenario1() {
    	Student student1 =new Student(123, "Prerana", "18-07-2000");
    	Student student2=new Student(111, "Sankalp", "02-01-2002");
    	
    	Info iobj=new Info();
    	iobj.display(student1);
    	iobj.display(student2);
    }
    private static void scenario2() {
    	Student[] student=new Student[2];
    	student[0]=new Student(123, "Prerana", "18-07-2000");
    	student[1]=new Student(111, "Sankalp", "01-01-2002");
    	
    	Info iobj=new Info();
    	for(int i=0;i<student.length;i++) {
    		iobj.display(student);
    	}
    }
    private static void scenario3() {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	Student[] student=new Student[n];
    	for(int i=0; i<student.length;i++) {
    		System.out.println("Enter details for students"+(i+1)+":");
    		System.out.println("Enter ID :");
    		int studId=sc.nextInt();
    		System.out.println("Enter name :");
    		String sName=sc.next();
    		System.out.println("Enter date of birth :");
    		String Date=sc.next();
    		
    		
    		student[i]=new Student(studId, sName, Date);
    	}
    	Info iobj=new Info();
    	for(int i=0;i<student.length;i++) {
    		iobj.display(student);
    	}
    }
}