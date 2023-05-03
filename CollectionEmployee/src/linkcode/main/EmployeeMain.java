package linkcode.main;

import java.util.Scanner;

import linkcode.info.EmployeeInfo;

public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeInfo einfo=new EmployeeInfo();
		int ch=0;
		String str=null;
		
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("\n1-Create\n2-Display\n3-Search\n4-Update\n5-Delete");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			if(ch==1)
			{
				einfo.create();
			}
			else if(ch==2)
			{
				einfo.displayall();
			}
			else if(ch==3)
			{
				System.out.println("Enter employee id to search");
				int empId=sc.nextInt();
				einfo.retriveEmployee(empId);
			}
			else if(ch==4)
			{
				System.out.println("Enter employee id to upadate");
				int empId=sc.nextInt();
				System.out.println("Enter new salary to update");
				String empSal=sc.next();
				einfo.updateEmployee();
			}
			System.out.println("Do you want to continue press yes/no");
			str=sc.next();
		}while(str.equals("yes"));
        System.out.println("------Thank you------");
}
}
