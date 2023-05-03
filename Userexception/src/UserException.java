import java.util.Scanner;
public class UserException {
	public static void display(String name,int age) {
		try {
			if(age<18) {
				throw new InvalidAgeException();
			}
			System.out.println("Welcome");
		}catch (InvalidAgeException e) 
		{
			e.printStackTrace();
		}	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter age");
		int age=sc.nextInt();
		System.out.println("Thank you");
		
		display(name,age);
	}

}
