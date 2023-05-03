import java.util.Scanner;
public class Bankmain {
	public static void display(int accno,String cname,int balance) throws Exception{
		try {
			if(balance<1000)
			{
				throw new InvalidBankException();
			}
			System.out.println("Welcome");
		}
		catch(InvalidBankException e)
		{		
			System.out.println(e);
			throw e;
		}
	}

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account no");
		int accno=sc.nextInt();
		
		System.out.println("Enter customer name");
		String cname=sc.next();
		
		System.out.println("Enter account balance");
		int balance=sc.nextInt();
		
		display(accno,cname,balance);
		System.out.println("Sbi");
		System.out.println("Thanks");
		
		
		

	}

}
