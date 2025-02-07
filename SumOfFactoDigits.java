import java.util.*;
class SumOfFactoDigits{
	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int Num=SC.nextInt();
		int Sum=0;
		while(Num>0){
			int rem=Num%10;
			int fact=1;
			for(int i=1;i<=rem;i++){
				fact*=i;
			}
			Sum+=fact;
			Num/=10;
		}
		System.out.println("Sum of Factorial is :  "+Sum);
	}
}