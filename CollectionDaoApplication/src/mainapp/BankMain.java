package mainapp;

import java.util.List;
import java.util.Scanner;

import bank.Account;
import Info.BankInfo;

public class BankMain {

	public static void main(String[] args) {

		BankInfo binfo=new BankInfo();
		Scanner sc=new Scanner(System.in);
		
		List<Account> lstacc=null;
		
		int ch=0;
		int accNo;
		do
		{
			System.out.println("1-Create Account \n2-Display Account\n3-Search Account\n4-Delete Account\n5-Update Account");
			System.out.println("Enter your choice");
			ch=sc.nextInt();

			switch(ch)
			{
			case 1:
				lstacc=binfo.create();
				break;
				
			case 2:
				binfo.display();				
				break;
			case 3:
				System.out.println("Enter account no to search");
				accNo=sc.nextInt();//101
				Account tempacc=binfo.searchAccount(accNo);
				if(tempacc!=null)
					System.out.println(tempacc);//use to String
				else
					System.out.println("Invalid Account no");
				
				break;
			case 4:
				System.out.println("Enter account number to delete object");
				accNo=sc.nextInt();
				binfo.delete(lstacc, accNo);				
				break;
				
			case 5:
			    System.out.println("Enter Account Number to update  ");
			    accNo=sc.nextInt();
			    binfo.updateAccount(accNo);
				break;
				
			default:
				System.out.println("Invalid Choice Please Try Again...");

			}
			System.out.println("do you want to continue press 1");
			ch=sc.nextInt();
			}while(ch==1);
		System.out.println("---------------THANK YOU-----------------------");
	}
}