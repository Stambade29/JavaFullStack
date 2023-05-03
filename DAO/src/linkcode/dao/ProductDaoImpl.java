package linkcode.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import linkcode.entity.Product;

public class ProductDaoImpl implements ProductDao{

	private static final int Prod_prize = 0;
	private static final int Prod_id = 0;

	@Override
	public void create(Product pobj) {
		// TODO Auto-generated method stub
		Connection con=DbConnection.getDbConnection();
		try {
			PreparedStatement pstate=con.prepareStatement("Insert into product values(?,?,?,?)");
			pstate.setInt(1, pobj.getProd_id());
			pstate.setString(2,pobj.getProd_name());
			pstate.setFloat(3,pobj.getProd_price());
			pstate.setInt(4,pobj.getProd_qty());
			int i=pstate.executeUpdate();
			if(i>0)
				System.out.println("Record Save");
			else
				System.out.println("not saved");
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			}
		}

	@Override
	public void search(int prod_id) {
		// TODO Auto-generated method stub
		Connection con=DbConnection.getDbConnection();
		try {
			PreparedStatement pstate=con.prepareStatement("select * from product where Prod_id=?");
			pstate.setInt(1,prod_id);
			ResultSet rs=pstate.executeQuery();
			if(rs.next())
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getInt(4));
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void delete(int prod_id) {
		// TODO Auto-generated method stub
		Connection con=DbConnection.getDbConnection();
		try {
			PreparedStatement pstate=con.prepareStatement("delete from product where Prod_id=?");
			pstate.setInt(1, prod_id);
			int i=pstate.executeUpdate();
			if(i>0)
				System.out.println("record deleted");
			else
				System.out.println("Record not deleted");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}		
	}

	@Override
	public void update(float Prod_price, int Prod_qty,int Prod_id) {
		// TODO Auto-generated method stub
		Connection con=DbConnection.getDbConnection();
		try {
			PreparedStatement pstate=con.prepareStatement("update product set Prod_price=?,Prod_qty=? where Prod_id=?");
			pstate.setFloat(1, Prod_qty);
			pstate.setInt(2, Prod_prize);
			pstate.setInt(3,Prod_id);
			int i = pstate.executeUpdate();
			if(i>0)
			{
				System.out.println("Record Updated Successfully");
			}
			else
			{
				System.out.println("Unable to update ");
			}	
		} catch (SQLException e) {
			{// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	}

	}
	


