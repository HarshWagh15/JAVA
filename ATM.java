import java.util.Scanner;
class ATM{
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);

		String Username1=null;
		String Password1=null;
		String Address1=null;
		long Contact=0;
		double Balance=0.0;
		for(; ;){

		System.out.println();
		System.out.println("     WELCOME     ");
		System.out.println("TWINKLE CHIT FUND");
		System.out.println();
		System.out.println("Select an Option");
		System.out.println();
		System.out.println("1.LOGIN");
		System.out.println("2.CREATE ACCOUNT");
		System.out.print("Enter Your Option:");
		int opt=SC.nextInt();

		if(opt==1){
			if(Username1==null){
				System.out.println("Create your account first!");
				continue;
			}

			System.out.println("Login");
			System.out.println();

			for(int i=3;i>=1;i--){
				System.out.println("Enter your Credentials:");
				System.out.println();
				System.out.print("Username");
				String Username=SC.next()
				System.out.print("Password");
				String Password=SC.next();
				if(Username.equals(Username1)&&Password.equals(Password1))
				{
					home:
					for(; ;){
						System.out.println();
						System.out.println("HOME PAGE");
						System.out.println();
						System.out.println("1.DEPOSIT");
						System.out.println("2.WITHDRAW");
						System.out.println("3.CHECK BALANCE");
						System.out.println("4.MINI STATEMENT");
						System.out.println("5.LOGOUT");
						System.out.println();
						System.out.println("ENTER YOUR OPTION");
						int opt1=SC.nextInt();
						System.out.println();


					}
				}
			}


		}
		else if(opt==2){
			System.out.println();
			System.out.println("Account Creation");
			System.out.println("Username:");
			Username1=SC.next();
			System.out.println("Password:");
			Password1=SC.next();
			System.out.println("Address:");
			Address1=SC.next();
			System.out.println("Contact:");
			Contact=SC.nextLong();
			System.out.println("Deposit Amount:");
			Balance=SC.nextDouble();
			System.out.println();
			System.out.println("Account Created Succesfully !");

		}
		else{
			System.out.println("Invalid Option !");
		}
	}
	}
}