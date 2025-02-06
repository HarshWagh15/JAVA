import java.util.*;
class GratuityRate
{
	public static void main(String[] args)
	{
	Scanner SC = new Scanner(System.in);
	System.out.print("Enter Subtotal:");
	float bill = SC.nextFloat();
	SC.nextLine();
	System.out.print("Enter Gratuity Rate:");
	float GratuityRate= SC.nextFloat();

	float Tip=(bill*GratuityRate)/100;
	float TotalBill= bill + Tip;
	System.out.println("Total bill is "+TotalBill);
	}
}