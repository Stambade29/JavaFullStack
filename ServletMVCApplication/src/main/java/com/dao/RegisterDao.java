package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Register;


public class RegisterDao {

	Connection con;
	jdbcConnection jc=new jdbcConnection();
	PreparedStatement pstate;
	
	public int createAccount(Register register) 
	{
		int i=0;
	  con=jc.getConnection();
	  try
	  {
		  PreparedStatement pstate = con.prepareStatement("insert into AccountInfo values(?,?,?)");
			pstate.setInt(1, register.getRegNo());
			pstate.setString(2, register.getCustName());
			pstate.setInt(3, register.getAccNo());
		    i=pstate.executeUpdate();
			if(i>0)
			{
				System.out.println("Account created");
			}
			else
			{
				System.out.println("Unable to create account");
			}
		  
	  }catch(SQLException e) {
		  e.printStackTrace();
	  }
	return i;
	
	}
	public void search(int regNo) {
		try {
			pstate = con.prepareStatement("select * from AccountInfo where accNo=?");
			pstate.setInt(1, regNo);
			ResultSet rs = pstate.executeQuery();
			if (rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
			} 
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

