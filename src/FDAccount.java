
public class FDAccount extends Account{

	private double interestRate;
	private double amount;
	private int noOfDays;
	private int ageOfACHolder;
	
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

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public int getAgeOfACHolder() {
		return ageOfACHolder;
	}

	public void setAgeOfACHolder(int ageOfACHolder) {
		this.ageOfACHolder = ageOfACHolder;
	}

	@Override
	double calculateInterest() {
		// TODO Auto-generated method stub
		if(getAmount()<10000000)
		{
			if(getAgeOfACHolder()<60)
			{
				if(getNoOfDays()>=7 && getNoOfDays()<=14)
				{
					setInterestRate(4.50);
				}
				else if(getNoOfDays()>=15 && getNoOfDays()<=29)
				{
					setInterestRate(4.75);
				}
				else if(getNoOfDays()>=30 && getNoOfDays()<=45)
				{
					setInterestRate(5.50);
				}
				else if(getNoOfDays()>=46 && getNoOfDays()<=60)
				{
					setInterestRate(7.00);
				}
				else if(getNoOfDays()>=61 && getNoOfDays()<=184)
				{
					setInterestRate(7.50);
				}
				else if(getNoOfDays()>=185 && getNoOfDays()<=365)
				{
					setInterestRate(8.00);
				}
			}
			else
			{
				if(getNoOfDays()>=7 && getNoOfDays()<=14)
				{
					setInterestRate(5.00);
				}
				else if(getNoOfDays()>=15 && getNoOfDays()<=29)
				{
					setInterestRate(5.25);
				}
				else if(getNoOfDays()>=30 && getNoOfDays()<=45)
				{
					setInterestRate(6.00);
				}
				else if(getNoOfDays()>=46 && getNoOfDays()<=60)
				{
					setInterestRate(7.50);
				}
				else if(getNoOfDays()>=61 && getNoOfDays()<=184)
				{
					setInterestRate(8.00);
				}
				else if(getNoOfDays()>=185 && getNoOfDays()<=365)
				{
					setInterestRate(8.50);
				}
			}
		}
		else
		{
			if(getNoOfDays()>=7 && getNoOfDays()<=14)
			{
				setInterestRate(6.50);
			}
			else if(getNoOfDays()>=15 && getNoOfDays()<=29)
			{
				setInterestRate(6.75);
			}
			else if(getNoOfDays()>=30 && getNoOfDays()<=45)
			{
				setInterestRate(6.75);
			}
			else if(getNoOfDays()>=46 && getNoOfDays()<=60)
			{
				setInterestRate(8.00);
			}
			else if(getNoOfDays()>=61 && getNoOfDays()<=184)
			{
				setInterestRate(8.50);
			}
			else if(getNoOfDays()>=185 && getNoOfDays()<=365)
			{
				setInterestRate(10.00);
			}
		}
		
		double interest = getAmount()*getInterestRate()/100;
		
		return interest;
	}
	
}
