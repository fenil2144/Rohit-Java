import java.util.Scanner;

interface CentralBank{
	void withdraw(int amount);
	void deposit(int amount);
}

class BankOfAmerica implements CentralBank{

	@Override
	public void withdraw(int amount) {
		System.out.println("Withdrawl at BankOfAmerica of "+amount);
	}

	@Override
	public void deposit(int amount) {
		System.out.println("Deposit at BankOfAmerica of "+amount);
	}
	
}

class SingaporeBank implements CentralBank{

	@Override
	public void withdraw(int amount) {
		System.out.println("Withdrawl at Singapore Bank of "+amount);
	}

	@Override
	public void deposit(int amount) {
		System.out.println("Deposit at Singapore Bank of "+amount);
	}
	
}

class ATMFactory{
	
	public CentralBank getCentralBank(String bankName) {
		if(bankName.equalsIgnoreCase("BOA")) {
			return new BankOfAmerica();
		}else if(bankName.equalsIgnoreCase("SB")){
			return new SingaporeBank();
		}else {
			return null;
		}
	}
}


public class FactoryDesignPattern {
	
	public static void main(String[] args) {
		ATMFactory atmFactory = new ATMFactory();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter Bank Name:");
		String bankName = sc.next();
		CentralBank cbObj = atmFactory.getCentralBank(bankName);
		cbObj.deposit(100);
		cbObj.withdraw(10);
	}

}
