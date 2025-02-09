import java.util.*;
class ReverseNo{
	public static void main(String[] args) {
	Scanner SC= new Scanner(System.in);
	System.out.print("Enter the No:");
	int Num=SC.nextInt();
	int rev=0;
	while(Num>0){
		int rem=Num%10;
		rev=rev*10+rem;
		Num/=10;

	}
	System.out.println(rev);
}
}