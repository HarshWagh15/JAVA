import java.util.*;
class SumOfEvenOddDigits{
	public static void main(String[] args) {
		int num=1234;
		int evenSum=0;
		int oddSum=0;
		int temp=0;
		int rem=num%10;
		temp=(rem%2==0)?(evenSum+=rem):(oddSum+=rem);

		num/=10;
		rem=num%10;
		temp=(rem%2==0)?(evenSum+=rem):(oddSum+=rem);

		num/=10;
		rem=num%10;
		temp=(rem%2==0)?(evenSum+=rem):(oddSum+=rem);

		num/=10;
		rem=num%10;
		temp=(rem%2==0)?(evenSum+=rem):(oddSum+=rem);

		System.out.println("EvenSum: "+evenSum);
		System.out.println("OddSum: "+oddSum);

	}
}