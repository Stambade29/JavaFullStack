import java.util.Scanner;
public class EvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		System.out.println("Enter the number ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		 if(n%2==0)
		{
			 for(i=0;i<=n;i=i+2)
			{
				System.out.println("The even numbers are:"+i);
			}
		}
				

	}

}
