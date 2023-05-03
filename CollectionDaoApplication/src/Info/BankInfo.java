package Info;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import bank.Account;
import dao.AccountDao;
import dao.AccountDaoInterface;


public class BankInfo {
	private AccountDaoInterface adi=null;
	public List<Account> create() {
		
		Scanner sc=new Scanner(System.in);
		List<Account> lstacc=new ArrayList<Account>();
		int ch;
		do
		{
			
			System.out.println("Enter Account no ,cust name and acc bal");
			int accNo=sc.nextInt();
			System.out.println("Enter Customer Name");
			String custName=sc.next();
			System.out.println("Enter Account Bal");
			double accBal=sc.nextDouble();
										
			Account accobj=new Account(accNo, custName, accBal);
			lstacc.add(accobj);
				
			
			System.out.println("DO you want to add next object press 1");
			ch=sc.nextInt();
		}while(ch==1);
		System.out.println("DO you want to save all record in database press 1");
		
		ch=sc.nextInt();
		if(ch==1)
		{
			adi=new AccountDao();
			adi.create(lstacc);
		}
		
		return lstacc;
	}
	
	public void display() {
		adi=new AccountDao();
		List<Account> lstacc=adi.displayAll();
		
		for(Account a:lstacc) {
			System.out.println(a.getAccNo()+"\t"+a.getCustName()+"\t"+a.getAccBal());
		}
	}
	
	public Account searchAccount(int accNo) {
		// TODO Auto-generated method stub
		Account tempacc=null;
		adi=new AccountDao();
		List<Account> lstacc=adi.search(accNo);
		tempacc=lstacc.get(0);
		return tempacc;
	}

	public void delete(List<Account> lstacc, int accNo) {
	    // Find the account with the specified account number
	    Account tempacc = null;
	    
	    adi=new AccountDao();
	    lstacc=adi.delete(accNo);
	    for (Account acc : lstacc) {
	        if (acc.getAccNo() == accNo) {
	            tempacc = acc;
	            break;
	        }
	    }
	}

	
	public void updateAccount(int accNo) {
		 adi=new AccountDao();
		 Scanner sc=new Scanner(System.in);
		
		 List<Account> lstacc;
		 System.out.println("Enter new customer name");
         String custName = sc.nextLine();
         System.out.println("Enter new account balance");
         double accBal = sc.nextDouble();
         
		 lstacc=adi.update(accNo,custName, accBal);
		
	}
}
