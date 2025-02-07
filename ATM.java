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
				System.out.print("Username:");
				String Username=SC.next();
				System.out.print("Password:");
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

						switch(opt1)
						{
						case 1:{
							System.out.println("DEPOSIT");
							System.out.println();
							System.out.print("Enter the Amount:");
							double DepoAmount=SC.nextDouble();
							Balance+=DepoAmount;
							System.out.println("Amount Deposited Succesfully.");
							System.out.println();
							break;
						}
					    case 2 :{
					    	System.out.println("WITHDRAW");
							System.out.println();
							System.out.print("Enter the Amount:");
							double WithdrawAmount=SC.nextDouble();
							System.out.println("Enter the Pin:");
							String Password3=SC.next();
							if(Password3.equals(Password)){
								if(WithdrawAmount<=Balance){
									Balance-=WithdrawAmount;
									System.out.println("Amount Debited Succesfully.");
								}else{
									System.out.println("Insufficient Funds !");
								}
							}else{
								System.out.println("Wrong Pin Entered !");
							}
							break;
						}
						case 3 :{
							System.out.println("CHECK BALANCE");
							System.out.println();
							for(int j=3;j>=1;j--){
								System.out.println();
								System.out.print("Enter the Pin:");
								String Password2=SC.next();
								if(Password2.equals(Password1)){
									System.out.println("Account Balance is "+Balance+" Rs");
									continue home;
								}
								else{
									System.out.println("Wrong Pin Entered !");
									System.out.println("Attempt left "+(j-1));
								}
							}
						
							System.out.println("Your Account Is blocked for next 24 hours.");
							System.exit(0);
							break;
						}
					case 4:{
						System.out.println("MINI STATEMENT");
						break;
					}
					case 5:{
						System.out.println("THANK YOU FOR USING OUR APP !");
						System.out.println("VISIT AGAIN !");
						System.exit(0);
						break;
					}
					}


					}
				}
				else{
					System.out.println("INVALID CRED");
					System.out.println("Attempt left : "+(i-1));
				}
			}
			System.out.println("THANK YOU ! NEVER VISIT AGAIN.");
			System.exit(0);


		}
		else if(opt==2){
			System.out.println();
			System.out.println("Account Creation");
			System.out.print("Username:");
			Username1=SC.next();
			System.out.print("Password:");
			Password1=SC.next();
			System.out.print("Address:");
			Address1=SC.next();
			System.out.print("Contact:");
			Contact=SC.nextLong();
			System.out.print("Deposit Amount:");
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