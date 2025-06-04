package Inheritance;

public class BankAccDriver {
	public static void main(String[] args) {
		SingleInheSavingsAcc s1 = new SingleInheSavingsAcc("Harsh","BKID1115","BOI",123456,3.0,"Savings");
		s1.displaySavingsAcc();  //Giving All inputs from BankAccount class and Savings Account class . It is Derived class.
		
		System.out.println("______________________________________________________");
		
//		s1.displayBankAcc();  // Parent class. Only Displays data from BankAccount class;
	}
}
