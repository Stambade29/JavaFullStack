import java.util.Scanner;
public class Calculation extends Thread{
	String args[];
	public Calculation(String args[])
	{
		this.args=args;
	}
	public void run()    ///running
	{
		Operation o=new Operation();
		o.addData();
		o.addn();
	}
}
