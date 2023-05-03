import java.util.Scanner;
public class Studentapplication {
	int rollno;
	String name;
	int sub1,sub2,sub3,total;
	
	float percentage;
	
	Scanner sc=new Scanner(System.in);
	
	
    public void create()
    {
    	 System.out.println("Enter student roll no:");
         rollno=sc.nextInt();
    	 System.out.println("Enter student name");
    	 name=sc.next();
    	 System.out.println("Enter subject marks");
    	 sub1=sc.nextInt();
    	 sub2=sc.nextInt();
    	 sub2=sc.nextInt();
    	     	 
    		
    }
  
		public void calculate()
		{
			
	       total=sub1+sub2+sub3;	
	       percentage=total/3;
          
  }
	
		public void display()
		{
			System.out.println("Name of student:"+name);
			System.out.println("Roll no of student:"+rollno);
			System.out.println("subjects are:"+sub1+sub2+sub3);
			System.out.println("total of marks is:"+total);
			System.out.println("percentage of student is:"+percentage);
			

		}

	
	
}
