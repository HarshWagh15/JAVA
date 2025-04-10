package principlesOfOOP;

public class EncapsBankAccountDriver {

	public static void main(String[] args) {
		EncapsBankAccount b1=new EncapsBankAccount("Harsh","BOI",987654321,123,"BKID005",50000);
	
//		b1.SetNewPin("Harsh",456,123);
		
		b1.Credit(987654321l, 123, 2000.0);
		b1.Debit(987654321, 123, 500.0);
		b1.getBalance("Harsh", 123);
		System.out.println(b1.getBankName());
		System.out.println(b1.getUserName());
		
	}
	
	
}

