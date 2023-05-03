package jdbcApplication;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class JDBC {

	public static void main(String[] args) 
	{	
	//step1-load drivers
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		//step2-connection to db
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","123456789");
			System.out.println("connection"+con);
			
			Scanner sc=new Scanner(System.in);
	//insert record in database---
			System.out.println("Enter student roll no");
			int rollno=sc.nextInt();
			System.out.println("Enter student name");
			String name=sc.next();
			System.out.println("Enter student percentage");
			float perct=sc.nextFloat();
			System.out.println("Enter your city");
			String city=sc.next();
			
			
			PreparedStatement pstate=con.prepareStatement("insert into student values(?,?,?,?)");
			pstate.setInt(1, rollno);
			pstate.setString(2, name);
			pstate.setFloat(3, perct);
			pstate.setString(4, city);
		
			int i=pstate.executeUpdate();//insert record or delete record or update record DML
			if(i>0)
				System.out.println("Record save");
			else
				System.out.println("not save");
			
			
	//	delete record
			System.out.println("Enter student roll no to delete recoed");
			int rollno1=sc.nextInt();
	
			PreparedStatement pstate1=con.prepareStatement("delete from student where rollno=?");
			pstate1.setInt(1, rollno1);
			
			
			int i1=pstate1.executeUpdate();// insert record or delete record or update record DML
			if(i1>0)
				System.out.println("Record deleted");
			else
				System.out.println("not save");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//update record
		System.out.println("Enter the city name to update city");
		Scanner sc=new Scanner(System.in);
		String city=sc.next();
		
	PreparedStatement pstate2=con.prepareStatement("update from student where city");
	pstate2.setString(1, city);
	
	int i2=pstate2.executeUpdate();
	try {
		if(i2>0)
		{
			System.out.println("Record updated");
		}
		else {
			System.out.println("not saved");
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}

	

