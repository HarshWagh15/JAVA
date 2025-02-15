import java.util.*;
class ArmstrongNo{
	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		System.out.print("Enter the No:");
		int num=SC.nextInt();
		int len=0;
		int dup=num;
		int sum=0;
		for(int i=num;i>0;i/=10){
			len++;
		}
		while(num>0){
			int rem=num%10;
			int pow=1;
			for(int i=1;i<=len;i++){
				pow*=rem;
			}
			sum+=pow;
				num/=10;
		}
		System.out.println(dup==sum?"Armstrong No":"not Armstrong No");
	}
}