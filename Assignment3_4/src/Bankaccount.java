
public class Bankaccount {
	 private int accNo;
	    private String custName;
	    private String accType;
	    private float balance;

	    public void BankAccount(int accNo, String custName, String accType, float balance) throws LowBalanceException, NegativeAmountException {
	        this.accNo = accNo;
	        this.custName = custName;
	        this.accType = accType;
	        if (balance < 0)
	        {
	        	throw new NegativeAmountException();
	        }
	            
	         else if
	         (accType.equalsIgnoreCase("Savings") && balance < 1000) {
	            throw new LowBalanceException();
	         }
	         else if 
	         (accType.equalsIgnoreCase("Current") && balance < 5000) {
	            throw new LowBalanceException();
	        }
	       
	    }
	    public void deposit(float amt) throws NegativeAmountException {
	        if (amt < 0) {
	            throw new NegativeAmountException();
	        }
	      
	    }

	    public void withdraw(float amt) throws NegativeAmountException, InsufficientFunds {
	        if (amt < 0) {
	            throw new NegativeAmountException();
	        }
	        if (accType.equalsIgnoreCase("Savings") && balance - amt < 1000) {
	            throw new InsufficientFunds();
	        }
	        if (accType.equalsIgnoreCase("Current") && balance - amt < 5000) {
	            throw new InsufficientFunds();
	        }
	       
	    }
	    public float getBalance() throws LowBalanceException {
	        if (accType.equalsIgnoreCase("Savings") && balance < 1000) {
	            throw new LowBalanceException();
	        }
	        if (accType.equalsIgnoreCase("Current") && balance < 5000) {
	            throw new LowBalanceException();
	        }
	        return this.balance;
	    }
	}



}
