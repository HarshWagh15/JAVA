import java.util.*;
class SquareRoot{
	public static void main(String[] args) {
		System.out.println("Enter The Num:");
		Scanner SC=new Scanner(System.in);
		int Num=SC.nextInt();
		boolean flag=false;
		for(int i=1;i<=Num;i++){
			if(i*i==Num){
				flag=true;
				System.out.println("It is perfect square root of "+i);
			}
			if(i*i>Num)
				break;
		}
		if(!flag)
			System.out.println("It is Not having perfect square root.");
		
	}
}