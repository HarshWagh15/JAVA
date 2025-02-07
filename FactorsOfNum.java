import java.util.*;
class FactorsOfNum{
	public static void main(String[] args) {
		Scanner SC= new Scanner(System.in);
		System.out.print("Enter the Num:");
		int num=SC.nextInt();
		int cnt=0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				cnt++;
				System.out.println(i+" ");
			}
		}
	System.out.println("Count is "+cnt);}
}
