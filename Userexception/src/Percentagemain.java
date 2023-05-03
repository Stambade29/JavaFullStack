import java.util.Scanner;
public class Percentagemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter name of student");
				String name=sc.next();
				System.out.println("Enter marks");
				int marks=sc.nextInt();
				display(name,marks);
	}
    private static void display(String name, int marks) {
		// TODO Auto-generated method stub
    	try {
    		if(marks<60)
    		{
    			throw new InvalidMarks();
    		}
    		System.out.println("Thank you");
    	}
    	catch(InvalidMarks e) {
    		e.printStackTrace();
    	}
    	System.out.println("Thanks");
		
		
	}

}
