import java.util.*;
class ViceVersaPrime{
	public static void main(String[] args) {
		System.out.print("Enter the No :");
		int num=new Scanner(System.in).nextInt();
		int cnt=0;
		int rev=0;
		int revCnt=0;
		for(int i=2;i<num;i++){
			if(num%i==0){
				cnt++;
			}
		}
		if(cnt==0){
			while(num>0){
				int rem=num%10;
				rev=rev*10+rem;
				num/=10;
			}
			for(int i=2;i<rev;i++){
			if(rev%i==0){
				revCnt++;
			}
		}
			if(revCnt==0)
			System.out.print("Its prime viceVersa.");
		else{
			System.out.print("It does not have prime reverse.");
		}
		}
		else{
			System.out.print("Its not prime viceVersa.");
		}


	}
}