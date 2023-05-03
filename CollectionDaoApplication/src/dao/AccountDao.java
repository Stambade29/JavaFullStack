package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import bank.Account;


public class AccountDao implements AccountDaoInterface {
	PreparedStatement pstate;
	Scanner sc=new Scanner(System.in);
	@Override
	public void create(List<Account> lstacc) {
		Connection con=DbConnection.getDbConnection();
		try {
			for(Account a:lstacc) {
				pstate=con.prepareStatement("insert into Account values(?,?,?)");
				pstate.setInt(1,a.getAccNo());
				pstate.setString(2,a.getCustName());
				pstate.setDouble(3,a.getAccBal());
				int i=pstate.executeUpdate();
				if(i>0)
					System.out.println("Record save...");
			}
		} catch (SQLException e) {
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
	}
	@Override
	public List<Account> search(int accNo) {
		List<Account> lstacc=new ArrayList<Account>();
		Connection con=DbConnection.getDbConnection();
		try {
			pstate = con.prepareStatement("select * from Account where accNo=?");
			pstate.setInt(1, accNo);
			ResultSet rs = pstate.executeQuery();
			if (rs.next()) {
				Account atemp = new Account(rs.getInt(1), rs.getString(2), rs.getDouble(3));
				lstacc.add(atemp);
			} 
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lstacc;
	}
	@Override
	public List<Account> delete(int accNo) {
		List<Account> lstacc=new ArrayList<Account>();
	    Connection con = DbConnection.getDbConnection();
	   int i;
	    try {
	        pstate = con.prepareStatement("delete from Account where accNo=?");
	        pstate.setInt(1, accNo);
	        i = pstate.executeUpdate();
	        if (i > 0) {
	            System.out.println("Record deleted...");
	        }
	        else
	        {
	        	System.out.println("Record Not Found...");
	        }
	    } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    } finally {
	        try {
	            con.close();
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }
	    return lstacc;
	}

	

	
	@Override
	public List<Account> displayAll() {
		Connection con=DbConnection.getDbConnection();
		String str="Select * from Account";
		List<Account> lstacc=new LinkedList<Account>();
		try {
			Statement stat=con.createStatement();
			ResultSet rs=stat.executeQuery(str);
			while(rs.next()) {
				//System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
				lstacc.add(new Account(rs.getInt(1),rs.getString(2),rs.getDouble(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lstacc;
	}
	public List<Account> updateData(int accNo, String custName, double accBal) {
	    List<Account> lstacc=new ArrayList<Account>();
	    Connection con = DbConnection.getDbConnection();
	    int i = 0;
	    try {
	        pstate = con.prepareStatement("update Account set custName=?, accBal=? where accNo=?");
	        pstate.setString(1, custName);
	        pstate.setDouble(2, accBal);
	        pstate.setInt(3, accNo);
	        i = pstate.executeUpdate();
	        if (i > 0) {
	            System.out.println("Record updated...");
	           // lstacc = search(accNo);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            con.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    return lstacc;
	}
	@Override
	public List<Account> update(int accNo, String custName, double accBal) {
		// TODO Auto-generated method stub
		return null;
	}

	
}