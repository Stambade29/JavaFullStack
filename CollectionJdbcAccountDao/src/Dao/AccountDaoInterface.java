package Dao;
import java.util.List;

import com.entity.Account;

public interface AccountDaoInterface {
	
	public void create(List<Account> lstacc);
	public List<Account> search(int accNo);
	public List<Account> delete(int accNo);
	public List<Account> updateData(int accNo, String custName, double accBal);
	public List<Account> displayAll();
	
}