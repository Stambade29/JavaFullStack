import java.util.Scanner;
public class Even1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range of even nos that you want");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			if(i%2==0) {
				System.out.println(i);
				
			}
			
		}
		
	}

}
