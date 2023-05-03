import java.util.Scanner;
 class developer extends employee {
	 
	 private int nohr;
	 Scanner sc=new Scanner(System.in);
	 
 public void input() {
	 accept();
	 System.out.println("Enter the hrs");
	 nohr=sc.nextInt();
 }
 public void output() {
	 display();
	 System.out.println("No of hrs :"+nohr);
	 
 }
}
