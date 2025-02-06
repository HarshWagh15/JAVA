import java.util.*;
class LoopTable{
	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		System.out.print("Enter the number:");
		int Num=SC.nextInt();
		System.out.print("Enter the range:");
		int Range=SC.nextInt();
		for(int i=1;i<=Range;i++){
			System.out.println(Num+"X"+i+"="+(Num*i));
		}
	}
}