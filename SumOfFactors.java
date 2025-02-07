import java.util.*;
class SumOfFactors{
	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int Num=SC.nextInt();
		int Sum=0;
		for(int i=1;i<=Num;i++){
			if(Num%i==0){
				System.out.print(i+" ");
				Sum+=i;
			}
		} 
		System.out.println();
		System.out.println("Sum of factors is "+Sum);
	}
}