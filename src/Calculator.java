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
				System.out.print("Enter the Average amount in your account: ");
				System.out.println("Interest gained: ");
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
			}
			
			case 3:
			{
				
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
