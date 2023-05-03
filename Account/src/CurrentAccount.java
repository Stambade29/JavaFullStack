
public class CurrentAccount extends Account1{
	public String BankName;

	public CurrentAccount(int accNO, String accType, double accBal, String bankName) {
		super(accNO, accType, accBal);
		BankName = bankName;
	}

	public String getBankName() {
		return BankName;
	}

	public void setBankName(String bankName) {
		BankName = bankName;
	}
	

}
