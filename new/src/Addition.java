import java.util.Scanner;

public class Addition {
	 public static void main(String[] args)

{
		
		int a,b,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two values");
        a=sc.nextInt();
        b=sc.nextInt();
        sum=a+b;
        System.out.println("The addition of numbers is:"+sum);
}
}

