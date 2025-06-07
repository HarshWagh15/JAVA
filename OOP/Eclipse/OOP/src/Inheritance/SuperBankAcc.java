package Inheritance;

public class SuperBankAcc {
	String userName;
	String IFSC;
	String BankName;
	long AccNo;
	
	public SuperBankAcc(){
		
	};
	
	public SuperBankAcc(String userName,String IFSC, String BankName,long AccNo){
		this.userName=userName;
		this.IFSC=IFSC;
		this.BankName=BankName;
		this.AccNo=AccNo;
	};
	
	public void displayBankAcc() {
		System.out.println(userName);
		System.out.println(IFSC);
		System.out.println(BankName);
		System.out.println(AccNo);
	};
	
}
