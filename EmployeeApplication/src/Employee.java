
public class Employee {
	private int EmpId;
	private String EmpName;
	private double Empsal;
	public Employee(int empId, String empName, double empsal) {
		super();
		EmpId = empId;
		EmpName = empName;
		Empsal = empsal;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public double getEmpsal() {
		return Empsal;
	}
	public void setEmpsal(double empsal) {
		Empsal = empsal;
	}
	

}
