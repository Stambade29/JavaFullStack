import java.util.Scanner;

public class Operation {
	public void addn() {
		int sum=0;
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum is"+sum);
	}
		public void addData() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any two numbers:");
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			int add=n1+n2;
			System.out.println("Addition is:"+add);
		
	}
	

}
