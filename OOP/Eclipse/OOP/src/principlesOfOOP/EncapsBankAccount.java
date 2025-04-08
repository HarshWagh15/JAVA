package principlesOfOOP;

public class EncapsBankAccount {
private String userName;
private String bankName;
private long accNo;
private int pin;
private String IFSC;
private double balance;


EncapsBankAccount(String userName,String bankName, long accNo,int pin, String IFSC,double balance){
	this.userName=userName;
	this.bankName=bankName;
	this.accNo=accNo;
	this.pin=pin;
	this.IFSC=IFSC;
	this.balance=balance;
	
}


public void SetNewPin(String userName, int newPin,int oldPin) {
	if (this.userName==userName && this.pin==oldPin) {
		pin=newPin;
		System.out.println("New pin set Successfully!");
		
	} else {
		System.out.println("Invalid Credentials !");
	}
}

public void getBalance(String UserName,int pin) {
	if (this.userName==userName && this.pin==pin) {
		System.out.println(balance);
	} else {
		System.out.println("Invalid Credentials !");
	}
}


public void Credit(long accNo,int pin,double Amt) {
	if (this.accNo==accNo && this.pin==pin) {
		if(Amt>0) {
			balance+=Amt;
			System.out.println("Amt Credited Successfully !");
		}
		 else {
		System.out.println("Invalid Amt !");
		}
	}else{
		System.out.println("Invalid Credentials !");
	}
}

public void Debit(long accNo,int pin,double Amt) {
	if (this.accNo==accNo && this.pin==pin) {
		if(Amt>0 && (balance-Amt)>1000) {
			balance-=Amt;
			System.out.println("Amt Debited Successfully !");
			System.out.println("Your Current Balance is:"+balance);
		}
		 else {
		System.out.println("Insufficient Balance !");
		}
	}else{
		System.out.println("Invalid Credentials !");
	}
}




}
