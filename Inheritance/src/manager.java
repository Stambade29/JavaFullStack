import java.util.Scanner;
class manager extends employee{
	  private int bonus;
 Scanner sc=new Scanner(System.in);
 
 public void getdata() {
	  
	 accept();
	 System.out.println("Enter the bonus");
	 bonus=sc.nextInt();
 }
 public void putdata() {
	 display();
	 System.out.println("Bonus is:"+bonus);
 }
}
