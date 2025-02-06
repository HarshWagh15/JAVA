import java.util.*;
class NoOfYears{
	public static void main(String[] args){
		System.out.print("Enter number of minutes:");
		int Minutes= new Scanner(System.in).nextInt();

		int minYear=365*24*60;
		int years = Minutes/minYear;
		int TotalDays = (Minutes%minYear)/(24*60);
		System.out.println(Minutes+"minutes is approximately " +years +" years and "+TotalDays+" days.");
	}
}