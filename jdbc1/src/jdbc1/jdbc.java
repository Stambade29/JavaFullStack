package jdbc1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CRUD CREATE RETRIEVE UPDATE DELETE
		try {


			//step 1-load the driver

			Class.forName("oracle.jdbc.OracleDriver");

			//step 2-establish a connection

			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","123456789");

			System.out.println("Connection : "+con);
			int ch = 0;
			
			do {
				int i;
				
				PreparedStatement pstate;
				ResultSet rs;
				Statement stmt;
				
				int rollno;
				String name;
				float perct;
				
				Scanner sc=new Scanner(System.in);
				System.out.println("\n\t1-Insert\n\t2-Delete\n\t3-Update\n\t4-Search\n\t5-Display");
				System.out.println("\nEnter Your Choice : ");
				ch=sc.nextInt();
				switch (ch) 
				{

				case 1://insert the record in database
					System.out.println("Insert the record");
					System.out.println(" Enter Student Roll Number : ");
					rollno=sc.nextInt();
					System.out.println(" Enter Student Name : ");
					name=sc.next();
					System.out.println(" Enter Student Percentage : ");
					perct=sc.nextFloat();

					pstate=con.prepareStatement("insert into student values (?,?,?)");
					pstate.setInt(1, rollno);
					pstate.setString(2, name);
					pstate.setFloat(3, perct);

					i=pstate.executeUpdate();//for DML Queries use executeUpdate (insert update or delete) 
					if(i>0)
					{
						System.out.println("Record INSERTED Successfully");
					}
					else
					{
						System.out.println("Unable to Insert ");
					}
					break;
					
				case 2:
					System.out.println("DELETE the record");
					System.out.println("Enter Student Roll Number to Delete Record :");
					rollno=sc.nextInt();
					pstate=con.prepareStatement("delete from student where rollno=?");
					pstate.setInt(1, rollno);

					i=pstate.executeUpdate();
					if(i>0)
					{
						System.out.println("Record deleted Successfully");
					}
					else
					{
						System.out.println("Unable to delete ");
					}
					break;

				case 3:
					System.out.println("Enter Student Old RollNo : ");
					rollno= sc.nextInt();
					System.out.println("Enter new Roll-No : ");
					int new_rollno = sc.nextInt();
					pstate = con.prepareStatement("update student set rollno=? where rollno=?");
					pstate.setInt(1, new_rollno);
					pstate.setInt(2, rollno);
					i=pstate.executeUpdate();
					if(i>0)
					{
						System.out.println("Record Updated Successfully");
					}
					else
					{
						System.out.println("Unable to update ");
					}
					break;

				case 4:
					System.out.println("Enter Student Roll Number to search a record ");
					rollno=sc.nextInt();
					pstate=con.prepareStatement("select * from student where rollno=?");
					pstate.setInt(1, rollno);

					rs=pstate.executeQuery();

					if(rs.next())
					{
						System.out.println("---------RECORD FOUND---------");
						System.out.println("\t"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
					} 
					else 
					{
						System.out.println("Record not found : ");
					}
					break;
				case 5:
					
					stmt=con.createStatement();
					rs=stmt.executeQuery("select * from student");
					ResultSetMetaData rsmd=rs.getMetaData();
					
					for(i=1;i<=rsmd.getColumnCount();i++)
					{
						
						System.out.print("\t"+rsmd.getColumnName(i)+"\t");
						
					}
					
					System.out.println("\n");
					
					
					while(rs.next())
					{
						System.out.println("------------------------------------------------------------");
						System.out.println("\t"+rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getFloat(3));
						
					}
					System.out.println("------------------------------------------------------------");
					break;

				}
				System.out.println("If you want to continue press 1 : ");
				ch=sc.nextInt();
			}while(ch==1);

		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}