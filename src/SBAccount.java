
public class SBAccount extends Account {

	private double interestRate;
	private double amount;
	private String accountType;
	
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	@Override
	double calculateInterest() {
		// TODO Auto-generated method stub
		if(accountType.equals("normal"))
			setInterestRate(4.00);
		else
			setInterestRate(6.00);
		
		double interest = getAmount()*getInterestRate()/100;
		return interest;
	}


}
