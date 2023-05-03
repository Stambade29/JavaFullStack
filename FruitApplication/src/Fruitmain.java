import java.util.Scanner;
public class Fruitmain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println(".....Fruit Basket Daily......");
		System.out.println("========================================");
		
		System.out.println("Address of Stall is:Pune");
		System.out.println("========================================");
		System.out.println("Fruit items available in our shop are:");
		System.out.println("Apple,Mango,Cherry,Strawberry,Banana,Guaava,Grapes");
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Enter Fruit Details");
		System.out.println("Fruit name is");
		String Fname=sc.next();
		System.out.println("Fruit quantity");
		int Fqty=sc.nextInt();
		
		System.out.println("----------------------------------------------");
		
		System.out.println("Enter Customer Details");
		System.out.println("Enter Customer id is");
		int Cid=sc.nextInt();
		System.out.println("Enter Customer name");
		String Cname=sc.next();
		System.out.println("Enter Customer mobile number");
		int Cmobile=sc.nextInt();
		System.out.println("Enter Customer Address");
		String Caddr=sc.next();
		
		System.out.println("-------------------------------------------------");
		
		System.out.println("Enter Owner Details");
		System.out.println("Enter owner id");
		int Ownerid=sc.nextInt();
		System.out.println("Enter Owner name");
		String Ownername=sc.next();
		System.out.println("Enter owner mobile number");
		int Ownermob=sc.nextInt();
		
		System.out.println("--------------------------------------------------");
		
		System.out.println("Enter address details");
		System.out.println("Enter owner city");
		String Ownercity=sc.next();
		System.out.println("Enter owner state");
		String OwnerState=sc.next();
		System.out.println("Enter owner pincode");
		int Ownerpincode=sc.nextInt();

	}
	}
