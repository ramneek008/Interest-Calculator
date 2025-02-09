import java.util.*;

public class Calculator {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int choice=0;

		do{
			System.out.println("MAIN MENU\n---------");
			System.out.println("1. Interest Calculator - SB\n2. Interest Calculator - FD\n3. Interest Calculator - RD\n4. Exit");
			System.out.println("Enter your option (1..4) : ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
			{
				SBAccount sb = new SBAccount();
				System.out.print("Enter the Average amount in your account: ");
				sb.setAmount(sc.nextDouble());
				System.out.println("Type of account:\n 1. Normal\n 2. NRI ");
				int t = sc.nextInt();
				if(t==1)
					sb.setAccountType("normal");
				else if(t==2)
					sb.setAccountType("nri");
				System.out.println("Interest gained: Rs. " + sb.calculateInterest());
				break;
			}
			
			case 2:
			{
				FDAccount fd = new FDAccount();
				System.out.print("Enter the FD amount: ");
				fd.setAmount(sc.nextDouble());;
				System.out.print("Enter the no. of days: ");
				fd.setNoOfDays(sc.nextInt());
				System.out.print("Enter your age: ");
				fd.setAgeOfACHolder(sc.nextInt());
				System.out.println("Interest gained is: Rs. "+ fd.calculateInterest());
				break;
			}
			
			case 3:
			{
				RDAccount rd = new RDAccount();
				System.out.print("Enter the monthly amount: ");
				rd.setMonthlyAmount(sc.nextDouble());
				System.out.print("Enter the no. of months: ");
				rd.setNoOfMonths(sc.nextInt());
				System.out.print("Enter your age: ");
				rd.setAge(sc.nextInt());
				System.out.println("Interest gained: Rs. " + rd.calculateInterest() );
			}
			
			case 4:
			{
				System.out.println("Exited");
				break;
			}
			
			default:
			{
				System.out.println("Invalid input");
				break;
			}
			
			}
		} while(choice!=4);
		sc.close();
	}

}
