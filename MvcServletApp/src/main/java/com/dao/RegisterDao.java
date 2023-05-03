package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.model.Login;
import com.model.Register;

public class RegisterDao {
	  static Connection con;
	  public boolean VaildateUser(Login lobj) {
			  boolean b=false;
			con=MyConnection.myConnection();
			try {
			  PreparedStatement ps=con.prepareStatement("select * from Bank where username=? and password=?");
			  ps.setString(1, lobj.getUname());
			  ps.setString(2, lobj.getPass());
			  ResultSet rs=ps.executeQuery();
			  if(rs.next())
			  {
				  b=true;
			  }
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		 return b;
	  }
	public int saveData(Register reg) {
		int i=0;
		con=MyConnection.myConnection();
		try
		{
			PreparedStatement ps=con.prepareStatement("insert into Bank values(?,?,?,?,?,?)");
			ps.setInt(1, reg.getRegno());
			ps.setString(2, reg.getFname());
			ps.setString(3, reg.getMob());
			ps.setString(4, reg.getUname());
			ps.setString(5, reg.getPass());
			ps.setFloat(6, reg.getAmt());
			i=ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		return i;
	}
	public List<Register> searchData(int rno) {
		ResultSet rs=null;
		Register r=null;
		LinkedList<Register> lst=new LinkedList<>();
		con=MyConnection.myConnection();
		int i=0;
		try
		{
			PreparedStatement ps=con.prepareStatement("select * from Bank where REGNO=?");
			ps.setInt(1, rno);
			rs=ps.executeQuery();	
		} 
		catch(Exception e) {
			System.out.println(e);
		}
		try
		{
		if(rs.next())
		{
		    r=new Register();
			r.setRegno(rs.getInt(1));
			r.setFname(rs.getString(2));
			r.setMob(rs.getString(3));
			r.setAmt(rs.getFloat(6));
			lst.add(r);
		}
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return lst;
	}
	public List<Register> displayAll() {
		ResultSet rs=null;
		Register r=null;
		LinkedList<Register> lst=new LinkedList<>();
		con=MyConnection.myConnection();
		Statement state=null;
		String str=null;
		int i=0;
		try
		{
			state=con.createStatement();
			rs=state.executeQuery("select * from Bank");
		while(rs.next())
		{
		    r=new Register();
			r.setRegno(rs.getInt(1));
			r.setFname(rs.getString(2));
			r.setMob(rs.getString(3));
			r.setAmt(rs.getFloat(6));
			lst.add(r);
		}
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return lst;
	}

}
