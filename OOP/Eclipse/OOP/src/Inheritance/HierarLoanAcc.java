package Inheritance;

public class HierarLoanAcc extends HierarBankAcc{
	int ROI;
	long PrincipleAmt;
	
	public HierarLoanAcc() {
		// TODO Auto-generated constructor stub
	};
	
	public HierarLoanAcc(String userName,String IFSC, String BankName,long AccNo,int ROI,long PrincipleAmt){
		this.userName=userName;
		this.IFSC=IFSC;
		this.BankName=BankName;
		this.AccNo=AccNo;
		
		this.ROI=ROI;
		this.PrincipleAmt=PrincipleAmt;
		
	};
	
	public void displayLoanAcc() {
		displayBankAcc();
		
		System.out.println(ROI);
		System.out.println(PrincipleAmt);
	}
}
