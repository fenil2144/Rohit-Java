abstract class Bank{
	
	abstract int getRateOfInterest();
	abstract void withdraw(int amount);
	abstract void deposit(String accountNumber, int amount);
	public void openAccount() {
		System.out.println("I am Opening ACcount");
	}
}

class MauritiusBank extends Bank{

	@Override
	int getRateOfInterest() {
		return 7;
	}

	@Override
	void withdraw(int amount) {
		System.out.println("I am Withdrawing Money");
	}

	@Override
	void deposit(String accountNumber, int amount) {
		System.out.println("I am Depositing Money");
		
	}
	
	@Override
	public void openAccount() {
		System.out.println("I am Opening ACcount");
	}
	
}
class Singapore extends Bank{

	@Override
	int getRateOfInterest() {
		return 7;
	}

	@Override
	void withdraw(int amount) {
		System.out.println("I am Withdrawing Money");
	}

	@Override
	void deposit(String accountNumber, int amount) {
		System.out.println("I am Depositing Money");
		
	}
	
	@Override
	public void openAccount() {
		System.out.println("I am Opening ACcount");
	}
	
}

public abstract class AbstractClassExample {
	
	abstract void printMessage();
}
