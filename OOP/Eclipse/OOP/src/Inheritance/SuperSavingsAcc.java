package Inheritance;

public class SuperSavingsAcc extends SuperBankAcc {
	double Interest;
	String Type;
	
	public SuperSavingsAcc(){
		
	};
	
	public SuperSavingsAcc(String userName,String IFSC, String BankName,long AccNo,double Interest,String Type){
		super(userName,IFSC,BankName,AccNo);
		
		this.Interest=Interest;
		this.Type=Type;
		
	};
	
	public void displaySavingsAcc() {
		displayBankAcc();
		
		System.out.println(Interest);
		System.out.println(Type);
	}
}
