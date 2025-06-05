package Inheritance;

public class DriverBankAcc {
	public static void main(String[] args) {
		HierarSavingsAcc h1=new HierarSavingsAcc("Harsh","abcd123","BOI",123456,5,"Savings");  // object for Savings Account
		h1.displaySavingsAcc();  // displays data from both BankAccount and SavingsAcc
		
		System.out.println("------------------------------");
		
		h1.displayBankAcc(); //only displays BAnkAcc data 
		
		System.out.println("------------------------------");
		
		HierarLoanAcc h2=new HierarLoanAcc("Harsh","abcd123","BOI",123456,8,500000);  // object for Loan Account
		
		h2.displayLoanAcc(); // displays data from both BankAccount and LoanAcc
		
		System.out.println("------------------------------");
		
		h1.displayBankAcc(); //only displays BAnkAcc data 
		
				}
}
