import java.util.*;
class NumberToWord{
	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		System.out.print("Enter the Num:");
		int num=SC.nextInt();
		String Word="";
		for(int i=num;i>0;i/=10){
			int rem=i%10;
			switch(rem){
			case 0:Word="Zero"+Word;break;
			case 1:Word="One"+Word;break;
			case 2:Word="Two"+Word;break;
			case 3:Word="Three"+Word;break;
			case 4:Word="Four"+Word;break;
			case 5:Word="Five"+Word;break;
			case 6:Word="Six"+Word;break;
			case 7:Word="Seven"+Word;break;
			case 8:Word="Eight"+Word;break;
			case 9:Word="Nine"+Word;break;

			}
		}
	System.out.print(Word);
	}
}