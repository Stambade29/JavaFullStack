
public class SavingAcc extends Account {
	public double Interestrate;

	public SavingAcc(int acc_no, String acc_type, double acc_bal, double interestrate) {
		super(acc_no, acc_type, acc_bal);
		Interestrate = interestrate;
	}

	public double getInterestrate() {
		return Interestrate;
	}

	public void setInterestrate(double interestrate) {
		Interestrate = interestrate;
	}
	

}
