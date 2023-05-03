import java.util.Scanner;
public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome");
		System.out.println("Customer Details");
		Customer cust=new Customer(1, "Shubhangi", "9764979640");
		System.out.println("Account Details");
		System.out.println("Enter account dno");
		int Acc_no=sc.nextInt();
		System.out.println("Enter account type");
		String Acc_type=sc.next();
		System.out.println("Enter account balance");
		double Acc_bal=sc.nextInt();
		

	}

}
