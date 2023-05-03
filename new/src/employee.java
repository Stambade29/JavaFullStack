import java.util.Scanner;
import static java.lang.System.out;

	public class employee
	{
	   static int officeId;
	   int empId;
	   static
	   {
		   out.println("Office id is");  //static clock
	   }
	   {
		   out.println(" used every time before constructor");
	   }
	   public employee()
	   {
		   out.println("Default constructor");
		   
	   }
	   public void display()
	   {
		   out.println("-----------");
		   out.println("OffiecId:"+officeId);
		   out.println("empId:"+empId);
		   
	   }
	   public static void show()
	   {
		   employee temp=new employee();
		   
	   }
	   
	   
	   

	}


