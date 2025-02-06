import java.util.*;
class SumOfEvenDigitsLoops{
	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		System.out.print("Enter the Num:");
		int Num=SC.nextInt();
		int Sum=0;
		while(Num>0){
			int rem=Num%10;
			if(rem%2==0){
				Sum+=rem;
		}
			Num/=10;
	}
		System.out.print(Sum);
	}
}