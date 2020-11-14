
public class SBAccount extends Account {

	private double interestRate;
	private double amount;
	
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
	
	@Override
	double calculateInterest() {
		// TODO Auto-generated method stub
		setInterestRate(4.00);
		
		double interest = getAmount()*getInterestRate()/100;
		return interest;
	}

}
