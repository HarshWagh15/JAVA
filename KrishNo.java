import java.util.*;
class KrishNo{
	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		System.out.print("Enter the No:");
		int num=SC.nextInt();
		int dup=num;
		int sum=0;
		
		for(int i=num;i>0;i/=10){
		int rem=num%10;
		int fact=1;
					for(int j=1;j<=rem;j++){
				fact*=j;
			}
			sum+=fact;
			num/=10;

		}
		System.out.println(dup==sum?" Krish No":"not Krish No");
	}
}
