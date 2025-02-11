import java.util.*;
class TempConvertor{
	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		System.out.print("  Temperature Convertor  ");
		System.out.println();
		System.out.println("1.Degree Celcius");
		System.out.println("2.Fahrenheit");
		System.out.println("3.Kelvin");
		System.out.println("4.Rankine");
		System.out.print("Select Temperature unit For Conversion:");
		int tempStart=SC.nextInt();
		System.out.print("Enter your temperature data:");
		double inputTemp=SC.nextInt();
		Double outputTemp=null;
		System.out.println();

		System.out.println("5.Degree Celcius");
		System.out.println("6.Fahrenheit");
		System.out.println("7.Kelvin");
		System.out.println("8.Rankine");
		System.out.print("Select Temperature unit which you want to be converted:");
		int tempEnd=SC.nextInt();

		switch(tempStart){
		case 1:switch(tempEnd){
			case 5:System.out.println("Invalid");break;
			case 6:System.out.println(outputTemp=(inputTemp*1.8)+32+" F");break;

		}
		}
	}
}