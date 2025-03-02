import java.util.*;
class PalindromicPrime{
	public static void main(String[] args) {
		Scanner SC =new Scanner(System.in);
		System.out.println("Enter the No:");
		int num=SC.nextInt();
		if(num==Reverse(num) && Prime(num)){
			System.out.println("It is Palindromic num ");
		}else{
			System.out.println("It is not a Palindromic num ");
		}

	}
	public static int Reverse(int numb){
		int rev=0;
		for(int i=numb;i>0;i/=10){
			int rem = i%10;
			rev=rev*10+rem;
		}
		return rev;
	}

	public static boolean Prime(int numb){
		int cnt=0;
		for(int i=2;i<numb;i++){
			if(numb%i==0)
			cnt++;
		}
		if(cnt==0)
			return true;

		return false;
	}
}