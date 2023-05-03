import java.util.Scanner;

public class AreaMain {

	public static void main(String[] args) {
		int ch;
		Area a=new Area();
		System.out.println("1.addition 2.Sub 3.Mul 4.Div\n Enter your choice");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		do {
			switch  (ch)
			{
			case 1:
				a.addition();
                break;
			case 2:
				a.substraction();
				break;
			case 3:
			
		      	a.multiplication();
				break;
			case 4:
				a.division();
				break;
				
			}System.out.println("Do you want to continue press 1");
			ch=sc.nextInt();
		}
		while(ch==1);
	
	
	
		// TODO Auto-generated method stub

	}

}
