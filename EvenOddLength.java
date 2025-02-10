import java.util.*;
class EvenOddLength{
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num=SC.nextInt();
		int count=0;
		for(int i=num;i>0;i/=10){
			count++;
		}
		int newNum=0;
		int place=1;

		for(int j=num;j>0;j/=10){
		int Digit=j%10;
		if(count%2==0){
			if(Digit%2!=0){
				Digit+=1;
			}
		}
		else{
			if(Digit%2==0){
				Digit+=1;
			}
		}
		newNum=Digit*place+newNum;
		place*=10;
		}
		System.out.println(newNum);
	}
}