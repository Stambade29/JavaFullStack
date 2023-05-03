package linkcode.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;



import linkcode.DBConnection.DBConnection;
import linkcode.entity.Employee;
import linkcode.info.EmployeeInfo;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public int createEmployee(List<Employee> lstemp) {
		int i=0;
		Connection con=DBConnection.getConnection();
		Employee emp=lstemp.get(0);
		try
		{
			PreparedStatement pstate=con.prepareStatement("Insert into Employee values(?,?,?)");
			pstate.setInt(1, emp.getEmpId());
			pstate.setString(2, emp.getEmpName());
			pstate.setDouble(3, emp.getEmpSal());
			i=pstate.executeUpdate();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}

	@Override
	public Employee retriveEmployee(List <Employee> lstemp,int empId) {
		int i=0;
		Connection con=DBConnection.getConnection();
		try
		{
			PreparedStatement pstate=con.prepareStatement("select * from Employee where empId=?");
			pstate.setInt(1, empId);
			ResultSet rs=pstate.executeQuery();
			if(rs.next())
			{
				System.out.println("Record found....");
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	@Override
	public int deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void displayall() {
		String str="select * from Employee";
		Connection con=DBConnection.getConnection();
		try
		{
			Statement state=con.createStatement();
			ResultSet rs=state.executeQuery(str);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public int updateEmployee(List<Employee> lstemp, int empId, double newSal) {
	    Employee tempacc=retriveEmployee(lstemp, empId);
		if(tempacc!=null) {
			tempacc.setEmpSal(newSal);
			System.out.println("Record updated...");
			System.out.println();
		}
		else
		{
			System.out.println("Record not updated...");
		}
		return empId;
	
	}

	

}