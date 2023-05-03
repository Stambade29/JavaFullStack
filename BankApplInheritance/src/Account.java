
public class Account {
	private int Acc_no;
	private String Acc_type;
	private double Acc_bal;
	public Account(int acc_no, String acc_type, double acc_bal) {
		super();
		Acc_no = acc_no;
		Acc_type = acc_type;
		Acc_bal = acc_bal;
	}
	public int getAcc_no() {
		return Acc_no;
	}
	public void setAcc_no(int acc_no) {
		Acc_no = acc_no;
	}
	public String getAcc_type() {
		return Acc_type;
	}
	public void setAcc_type(String acc_type) {
		Acc_type = acc_type;
	}
	public double getAcc_bal() {
		return Acc_bal;
	}
	public void setAcc_bal(double acc_bal) {
		Acc_bal = acc_bal;
	}
	

}
