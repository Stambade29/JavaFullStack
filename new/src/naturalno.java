import java.util.Scanner;

public class naturalno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		System.out.println("Enter the numbers range of natural nos:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for( int i=1;i<=n;i++)
		{
			System.out.println(i + "  ");
			sum=sum+i;
		}
		System.out.println("Addition on natural nos is:"+sum);

	}

}
