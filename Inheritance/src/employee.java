import java.util.Scanner;
class employee 
{
 protected int empid;
 protected String empname;
 protected double empsal;


public void accept()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter employee id");
	empid=sc.nextInt();
	System.out.println("Enter the name of employee");
	empname=sc.next();
	System.out.println("Enter the salary of emplotee");
	empsal=sc.nextInt();
	}
public void display()
{
	System.out.println("Employee id is:"+empid);
	System.out.println("Employee name is:"+empname);
	System.out.println("Employee salary is:"+empsal);
}
}
class Manager extends Employee()
{
	
}

     