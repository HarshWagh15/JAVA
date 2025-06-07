package Inheritance;

public class SingleInheSavingsAcc extends SingleInheBankAcc{
	double Interest;
	String Type;
	
	public SingleInheSavingsAcc(){
		
	};
	
	public SingleInheSavingsAcc(String userName,String IFSC, String BankName,long AccNo,double Interest,String Type){
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
