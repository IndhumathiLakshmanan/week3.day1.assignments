package week3.day1.assignments;

public class AxisBank extends Bankinfo {
	
	public void deposit() {
		
		System.out.println("Axis bank account type");
	}
		
		
	public static void main(String[] args) {
		
		AxisBank account = new AxisBank();
		
		
		//method deposit in AxisBank overrides method deposit in BankInfo
		
		account.deposit();
		account.saving();
		account.fixed();
	}

}
