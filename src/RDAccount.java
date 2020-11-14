
public class RDAccount extends Account {
	
	private double interestRate;
	private double amount;
	private int noOfMonths;
	private int age;

	private double monthlyAmount;

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
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNoOfMonths() {
		return noOfMonths;
	}

	public void setNoOfMonths(int noOfMonths) {
		this.noOfMonths = noOfMonths;
	}

	public double getMonthlyAmount() {
		return monthlyAmount;
	}

	public void setMonthlyAmount(double monthlyAmount) {
		this.monthlyAmount = monthlyAmount;
	}

	@Override
	double calculateInterest() {
		// TODO Auto-generated method stub

		if (age<60)
		{
			if(noOfMonths==6)
			{
				setInterestRate(7.50);
			}
			else if(noOfMonths==9)
			{
				setInterestRate(7.75);
			}
			else if(noOfMonths==12)
			{
				setInterestRate(8.00);
			}
			else if(noOfMonths==15)
			{
				setInterestRate(8.25);
			}
			else if(noOfMonths==18)
			{
				setInterestRate(8.50);
			}
			else if(noOfMonths==21)
			{
				setInterestRate(8.75);
			}
		}
		else
		{
			if(noOfMonths==6)
			{
				setInterestRate(8.00);
			}
			else if(noOfMonths==9)
			{
				setInterestRate(8.25);
			}
			else if(noOfMonths==12)
			{
				setInterestRate(8.50);
			}
			else if(noOfMonths==15)
			{
				setInterestRate(8.75);
			}
			else if(noOfMonths==18)
			{
				setInterestRate(9.00);
			}
			else if(noOfMonths==21)
			{
				setInterestRate(9.25);
			}
		}
		
		/*
		  M =R[(1+i)^n – 1]/(1-(1+i)^(-1/3))

			Where,
			
			M = Maturity value of the RD
			R = Monthly RD installment to be paid
			n = Number of quarters (tenure)
			i = Rate of Interest / 400
		 */
		
		double amount = monthlyAmount*noOfMonths;
		double interest = (monthlyAmount*(Math.pow(1+(interestRate/400), noOfMonths/3)-1))/(1-(1/Math.cbrt(1+(interestRate/400)))) - amount;
		return interest;
	}
}
