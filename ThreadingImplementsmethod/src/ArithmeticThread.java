import java.util.Scanner;
public class ArithmeticThread implements Runnable {
	Arithmeticoperation ao;
	int ch=0;
	
	Scanner sc=new Scanner(System.in);
	public ArithmeticThread(Arithmeticoperation ao) {
		this.ao=ao;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("1-Add\n2-sub");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			ao.addData();
			break;
		case 2:
			ao.subData();
			break;
		}
	}
}
