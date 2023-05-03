import java.util.Scanner;
public class App  {

	private static final Student Student = null;
	public static void main(String[] args) {
	App aobj=new App();
	aobj.scenario1();
	aobj.scenario2();
	aobj.scenario3();

	
		}
	public static void scenario1() {
		Student student1=new Student(1,"Sneha","2001-2-3");
		Student student2=new Student(2,"Pradnya","2003-4-6");
		
		info iboj=new info();
		info iobj=new info();
		iobj.display(student1);
		iboj.display(student2);
	}
	private static void scenario2() {
		Student[] students=new Student[2];
		students[0]=new Student(1,"Sneha","2001-2-3");
		students[1]=new Student(2,"Pardnya","2003-4-6");
		
		info iobj=new info();
		for(int i=0;i<students.length;i++) {
			iobj.display(Student);
		}
	}
	public static void scenario3() {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter how many student do you want to store in array ");
	int n=sc.nextInt();
	Student[] students=new Student[n];
	 
	for(int i=0;i<students.length;i++)
	{
		System.out.println("Enter Student details"+(i+1)+":");
		System.out.println("Enter ID:");
		int id=sc.nextInt();
		System.out.println("Enter Name:");
		String name=sc.next();
		System.out.println("Enter date of birth:");
		String DOB=sc.next();
		
		students[i]=new Student(id, name, DOB);
	}
	info iobj=new info();
	for(int i=0;i<students.length;i++) {
		iobj.display(Student);
	}
	}
	}
		
	
			
		
	

	


