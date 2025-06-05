package Inheritance;

public class HierarBankAcc {
	String userName;
	String IFSC;
	String BankName;
	long AccNo;
	
	public HierarBankAcc() {
		// TODO Auto-generated constructor stub
	};
	
	public HierarBankAcc(String userName,String IFSC, String BankName,long AccNo){
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
