package Inheritance;

public class HierarSavingsAcc extends HierarBankAcc{
	int ROI;
	long PrincipleAmt;
	
	public HierarSavingsAcc() {
		// TODO Auto-generated constructor stub
	};
	
	public HierarSavingsAcc(String userName,String IFSC, String BankName,long AccNo,int ROI,long PrincipleAmt){
		this.userName=userName;
		this.IFSC=IFSC;
		this.BankName=BankName;
		this.AccNo=AccNo;
		
		
		this.ROI=ROI;
		this.PrincipleAmt=PrincipleAmt;
		
	};
	
	public void displaySavingsAcc() {
		displayBankAcc();
		
		System.out.println(ROI);
		System.out.println(PrincipleAmt);
	}
}
