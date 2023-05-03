package linkcode.dao;

import java.util.List;

import linkcode.entity.Employee;

public interface EmployeeDao {
     int createEmployee(List<Employee> lstemp);
     int deleteEmployee(int empId);
     void displayall();
	int updateEmployee(List<Employee> lstemp, int empId, double newSal);
	Employee retriveEmployee(List<Employee> lstemp,int empId);
}