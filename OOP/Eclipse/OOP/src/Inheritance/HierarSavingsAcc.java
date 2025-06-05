package Inheritance;

public class HierarSavingsAcc extends HierarBankAcc{
	double Interest;
	String Type;
	
	public HierarSavingsAcc() {
		// TODO Auto-generated constructor stub
	};
	
	public HierarSavingsAcc(String userName,String IFSC, String BankName,long AccNo,double Interest,String Type){
		this.userName=userName;
		this.IFSC=IFSC;
		this.BankName=BankName;
		this.AccNo=AccNo;
		
		
		this.Interest=Interest;
		this.Type=Type;
		
	};
	
	public void displaySavingsAcc() {
		displayBankAcc();
		
		System.out.println(Interest);
		System.out.println(Type);
	}
}
