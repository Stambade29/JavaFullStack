import java.util.Scanner;
class Employee
{
	protected int EmpId;
	protected String EmpName;
	protected float EmpSal;
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee Id");
		EmpId=sc.nextInt();
		System.out.println("Enter the Employee Name");
		EmpName=sc.next();
		System.out.println("Enter the Employee Salary");
		EmpSal=sc.nextInt();
				
	}
	public void display()
	{
		System.out.println("Employee Id is:"+EmpId);
		System.out.println("Employee Name is:"+EmpName);
		System.out.println("Employee Salary is:"+EmpSal);
	}
}
class Manager extends Employee {
	private int bonus;
	
	public void getdata()
	{
		accept();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Bonus of Manager");
		bonus=sc.nextInt();		
	}
	public void putdata()
	{
		display();
		System.out.println("Bonus of Manager is:"+bonus);
	}
}
class Developer extends Employee{
	private int nohr;   //nohr=No of hrs
	
	public void indata()
	{
		accept();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of hrs that developer work for extra time");
		nohr=sc.nextInt();
	}
	public void outdata()
	{
		display();
		System.out.println("Extra hrs are:"+nohr);
	}
}
public class TestInheritance {
    public static void main(String args[])
    
    {
    	Scanner sc=new Scanner(System.in);
    	Manager sw=new Manager();
    	sw.getdata();
    	sw.putdata();
    	
    	//Scanner s=new Scanner(System.in);
    	Developer obj=new Developer();
    	obj.indata();
    	obj.outdata();  	
    }
}

