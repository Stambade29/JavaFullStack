import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		int n1,n2,result;
		Scanner sc= new Scanner(System.in);
		//System.out.println("Enter first number");
		//n1=sc.nextInt();
		//System.out.println("Enter second number");
		//n2=sc.nextInt();
		System.out.println("hooooooooo");
		try {
			n1=Integer.parseInt(args[5]);
			n2=Integer.parseInt(args[1]);
		result=n1/n2;
		System.out.println("hiiiiiii");
		System.out.println("Divide is "+result);
		
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("always execute");
		}
		System.out.println("thank you");
		// TODO Auto-generated method stub

	}

}