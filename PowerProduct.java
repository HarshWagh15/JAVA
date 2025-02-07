import java.util.*;
class PowerProduct{
	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int Num=SC.nextInt();
		System.out.print("Enter the Power:");
		int Pow=SC.nextInt();
		int Op=1;

		for(int i=1;i<=Pow;i++){
			Op*=Num;
		}
		System.out.println("Output is : "+Op);
	}
}