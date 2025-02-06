import java.util.*;
class PoundToKg {
	public static void main(String[] args){
	System.out.print("Enter Pounds No :");
	double Pounds = new Scanner(System.in).nextDouble();
	double TotalKG=Pounds*0.454;
	System.out.println("Total KG's are: "+TotalKG);
	}
}