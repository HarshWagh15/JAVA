import java.util.*;
class EvenOddWithoutMod{
	public static void main(String[] args){
		System.out.print("Enter Num:");
		int num= new Scanner(System.in).nextInt();
		System.out.println(num%2==0);//With Mod
		System.out.println((num/2)==(num/2.0));//Without Mod
		System.out.println((num/2)*2==num);//Without Mod
	}
}