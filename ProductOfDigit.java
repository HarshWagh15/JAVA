import java.util.*;
class ProductOfDigit{
	public static void main(String[] args) {
		int num=1234;
		int product=1;
		int rem=num%10;
		product*=rem;
		num/=10;

		rem=num%10;
		product*=rem;
		num/=10;

		rem=num%10;
		product*=rem;
		num/=10;

		rem=num%10;
		product*=rem;
		num/=10;

		System.out.println("Product of Digits is "+product);



	}
}