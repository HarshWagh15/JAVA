import java.util.*;
class Divisible{
	public static void main(String[] args) {
		System.out.print("Enter the Number:");
		double Num=new Scanner(System.in).nextDouble();
		String Division=(Num%5==0&&Num%2==0)?("HiFiveTwo"):((Num%2==0)?("HiTwo"):((Num%5==0)?("HiFive"):("Blank")));
		System.out.println(Division);
	}
}