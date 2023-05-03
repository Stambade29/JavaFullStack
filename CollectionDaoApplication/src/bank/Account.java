package bank;

public class Account {
	private int accNo;
	private String custName;
	private float accBal;
	public Account(int accNo, String custName, double accBal) {
		super();
		this.accNo = accNo;
		this.custName = custName;
		this.accBal = (float) accBal;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = (float) accBal;
	}
	@Override
	public String toString() {
		return getAccNo()+"\t"+getCustName()+"\t"+getAccBal();
	}	
}
