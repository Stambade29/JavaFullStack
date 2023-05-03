package dao;
import java.util.List;
import bank.Account;
public interface AccountDaoInterface {
	public void create(List<Account>lst);
	public List<Account>search(int accNo);
	public List<Account>delete(int accNo);
	public List<Account>update(int accNo,String custName,double accBal);
	public List<Account>displayAll();
}
