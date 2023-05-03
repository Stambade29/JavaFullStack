
public class CurrentAcc extends Account {
	public String Bankname;

	public CurrentAcc(int acc_no, String acc_type, double acc_bal, String bankname) {
		super(acc_no, acc_type, acc_bal);
		Bankname = bankname;
	}

	public String getBankname() {
		return Bankname;
	}

	public void setBankname(String bankname) {
		Bankname = bankname;
	}
	

}
