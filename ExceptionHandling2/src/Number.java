import java.util.Scanner;
public class Number {
	int a;
	int b;
	double result;
	public Number(int a, int b, double result) {
		super();
		this.a = a;
		this.b = b;
		this.result = result;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}	
	public void display(int a,int b) {
		double result;
		Scanner sc=new Scanner(System.in);
		CalcAverage c=new CalcAverage();
		Number n=new Number(b, b, result);
		a=sc.nextInt();
		b=sc.nextInt();
		result=a+b;
		System.out.println("Additon is:"+result);
		
		result=a-b;
		System.out.println("Substraction is:"+result);

		result=a*b;
		System.out.println("Multiplication is:"+result);
		try {
		String[] args;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		result=a/b;
		System.out.println("Division is :"+result);
		}
		catch(Exception ex) {
			System.out.println("Exception:"+ex);	
		}
	}
		
	}
}
