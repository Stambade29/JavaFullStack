import java.util.Scanner;
public class Account2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer id,name,mobile no");
		int Cust_id=sc.nextInt();
		String Cust_name=sc.next();
		int Cust_mob=sc.nextInt();
		System.out.println("Enter address");
		System.out.println("Enter city");
		String city=sc.next();
		System.out.println("Enter State");
		String State=sc.next();
		System.out.println("Enter pincode");
		int pincode=sc.nextInt();
		
		System.out.println("Enter account number");
		int AccNo=sc.nextInt();
		
		System.out.println("Enter account type saving or current");
		String accType=sc.next();
		
		System.out.println("Enter account balance");
		double AccBal=sc.nextDouble();
		
		Account1 aobj=null;
		
		if(accType.equalsIgnoreCase("Saving")) {
		float Interestrate=sc.nextFloat();
		aobj=new SavingAccount(AccNo, accType, AccBal,Interestrate);			
		}
		
		if(accType.equalsIgnoreCase("Current")) {
		String 	BankName=sc.next();
		aobj=new CurrentAccount(AccNo, accType, AccBal, BankName);
		}
		
		Customer cust=new Customer(Cust_id, Cust_name, Cust_mob, aobj);
		display(cust);	
		
		
	}
	public static void display(Customer cust) {
		System.out.println("========================================");

		System.out.println("Welcome to SBI Bank");
		System.out.println("Customer ID :"+cust.getCust_id());
		System.out.println("Customer Name:"+cust.getCust_name());
		System.out.println("Customer Mobile no:"+cust.getCust_mob());
		
		System.out.println("==========================================================");
		
		Account1 acc=cust.getAccobj();
		
		System.out.println("Account no:"+acc.getAccNO());
		System.out.println("Account Type:"+acc.getAccType());
		System.out.println("Account Balance:"+acc.getAccBal());
		
		if(acc instanceof SavingAccount) {
			SavingAccount sacc=(SavingAccount)acc;
			System.out.println("Account Interest rate is:"+sacc.Interestrate);
		}
		if(cust.getAccobj()instanceof CurrentAccount) {
			CurrentAccount cacc=(CurrentAccount)cust.getAccobj();
			System.out.println("Account interest rate:"+cacc.BankName);
		}
		

	}

}
