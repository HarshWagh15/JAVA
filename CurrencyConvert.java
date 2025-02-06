import java.util.*;
class CurrencyConvert{
	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		System.out.println(" Currency Converter");
		System.out.println();
		System.out.println(" Enter the Amount(INR):");
		float INR=SC.nextFloat();
		System.out.println();

		System.out.println("List Of Currency");
		System.out.println("1.USD");
		System.out.println("2.EUR");
		System.out.println("3.GBP");
		System.out.println("4.PKR");
		System.out.println("5.RBL");

		String Curr=SC.next().toUpperCase();

		float ConCurr=0;
		if (Curr.equals("USD")) {
			System.out.println(ConCurr=INR/86.56f);
		}
		else if(Curr.equals("EUR")){
			System.out.println(ConCurr=INR/90.25f);
		}
		else if(Curr.equals("GBP")){
			System.out.println(ConCurr=INR/107.69f);
		}
		else if(Curr.equals("PKR")){
			System.out.println(ConCurr=INR/0.31f);
		}
		else if(Curr.equals("RBL")){
			System.out.println(ConCurr=INR/0.88f);
		}
		else{
			System.out.println("Invalid Currency");
		}







	}
}