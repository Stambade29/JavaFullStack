import java.util.Scanner;
class CurrentAccount
{
	protected int AccountNo;
	protected String BankName;
	protected double BankBalance;
	protected int Transactionlimit;
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Account Number");
		AccountNo=sc.nextInt();
		System.out.println("Enter Bank name");
		BankName=sc.next();
		System.out.println("Enter the Bank Balance");
		BankBalance=sc.nextDouble();
		System.out.println("Enter your limit of transaction");
		Transactionlimit=sc.nextInt();
	}	
	public void display()
		{
			System.out.println("Account number is:"+AccountNo);
			System.out.println("Bank name is:"+BankName);
			System.out.println("Bank balance is:"+BankBalance);
			System.out.println("Transaction limit is:"+Transactionlimit);	
		}
	}
class SavingAccount extends CurrentAccount
{
	
	private double MustBalance;
	
	public void getdata()
	{
		accept();
		int p,r,t,interest; //p=principle amount  r=rate  t=time
		System.out.println("Enter the amount of p,r,t");	
	    Scanner sc=new Scanner(System.in);
	    p=sc.nextInt();
	    r=sc.nextInt();
	    t=sc.nextInt();
	    interest= (p*r*t)/100; 
		System.out.println(" interest is:"+interest);
		System.out.println(" Enter the balance to be in your account");
		MustBalance=sc.nextInt();
	}
	public void setdata()
	{
		display();
		System.out.println("Balance to be in account is:"+MustBalance);
	}
}

public class AccountTest1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		SavingAccount s=new SavingAccount();
		s.getdata();
		s.setdata();
	}
}
