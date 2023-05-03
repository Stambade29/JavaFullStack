
public class SavingAccount extends Account1 {
public float Interestrate;

public SavingAccount(int accNO, String accType, double accBal, float interestrate) {
	super(accNO, accType, accBal);
	Interestrate = interestrate;
}

public float getInterestrate() {
	return Interestrate;
}

public void setInterestrate(float interestrate) {
	Interestrate = interestrate;
}



}
