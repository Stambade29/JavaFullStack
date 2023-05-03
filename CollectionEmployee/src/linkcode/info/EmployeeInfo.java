package linkcode.info;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import linkcode.dao.EmployeeDao;
import linkcode.dao.EmployeeDaoImpl;
import linkcode.entity.Employee;

public class EmployeeInfo {
	Scanner sc=new Scanner(System.in);
	
	public void create() {
		System.out.println("Enter employee id");
		int empId=sc.nextInt();
		System.out.println("Enter employee name");
		String empName=sc.next();
		System.out.println("Enter employee salary");
		double empSal=sc.nextDouble();
		Employee emp=new Employee(empId, empName, empSal);
		List<Employee> lstemp=new ArrayList<Employee>();
		lstemp.add(emp); 
		EmployeeDao edao=new EmployeeDaoImpl();
		int i=edao.createEmployee(lstemp);
		if(i>0)
		{
			System.out.println("Record created...");
		}
	}
    public void displayall() {
        EmployeeDao eda=new EmployeeDaoImpl();
        eda.displayall();
    }
    public void retriveEmployee(int empId) {
    	EmployeeDao eda=new EmployeeDaoImpl();
    	List<Employee> lstemp = null;
		eda.retriveEmployee(lstemp, empId);
    }
	public void updateEmployee() {
		EmployeeDao eda=new EmployeeDaoImpl();
		List<Employee> lstemp=null;
		eda.updateEmployee(null,0,0);
	}
}
