import java.util.*;
class Factorial{
	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int Num=SC.nextInt();
		int Fact=1;
		for(int i=1;i<=Num;i++){
			Fact*=i;
		}
		System.out.println("Factorial is: "+Fact);
	}
}