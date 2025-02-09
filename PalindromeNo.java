import java.util.*;
class PalindromeNo{
	public static void main(String[] args) {
		Scanner SC= new Scanner(System.in);
		System.out.print("Enter the No:");
		int num=SC.nextInt();
		int rev=0;
		int dup=num;
		while(num>0){
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;

		}
		if(rev==dup){
			System.out.println("The no is valid Palindrome !");
		}
		else{System.out.println("The no is not valid Palindrome !");
	}
	}
}