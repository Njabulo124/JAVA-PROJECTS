package savings;
import java.util.Scanner;
public class Savings {
	public double savingAccount = 0.0;
	Scanner n = new Scanner(System.in);
	
	
		
	
	public void deposit() {
		System.out.print("Enter the amount you want to deposit: R");
		int depositFunds = n.nextInt();
		savingAccount += depositFunds;
		System.out.println("Deposit Successful. Your new balance is: R"+savingAccount);
	}
    public void withdraw() {
		
		System.out.print("Enter the amount you want to widthdraw: R");
		double withdrawFunds = n.nextInt();
		if( withdrawFunds <= savingAccount) {
		   savingAccount -= withdrawFunds;		
		   System.out.println("Withdrawal successful. Your new balance is: R"+savingAccount);
		}else
		{
			System.out.println("Insufficient funds");
		}

	}
    public void viewBalance(){
    	System.out.println("Your current balance is : R"+savingAccount);}
	public static void main(String[] args) {
		Savings save = new Savings();
		int m;
	do {
		Scanner p = new Scanner(System.in);
		System.out.println("ATM Menu");
		System.out.println("1. View Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");
		
		System.out.print("Enter your choice (1-4): ");
		 m = p.nextInt();
		switch(m) {
		case 1: save.viewBalance();
		break;
		case 2: save.deposit();
		break;
		case 3 : save.withdraw();
		break;
		case 4: System.out.println("Thank you for using the ATM. Goodbye!");
		break;
		}
		 }while(m !=4 );
		
		
	}
	
	
	
}
