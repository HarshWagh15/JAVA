import java.util.Scanner;
class BMICalc{
	public static void main(String[] args) {
		System.out.print("Enter Your Weight in Pounds:");
		double Weight=new Scanner(System.in).nextDouble();
		new Scanner(System.in).nextLine();
		System.out.print("Enter Your Height in Inches:");
		double Height=new Scanner(System.in).nextDouble();
		Weight*=0.45359237;
		Height*=0.0254;
		double BMI = Weight/(Height*Height);
		System.out.println("BMI is "+BMI);

	}
}