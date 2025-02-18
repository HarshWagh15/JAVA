// import java.util.*;
class NeonNum{
	public static void main(String[] args) {
	
	
	// Scanner SC=new Scanner(System.in);
	int num=9;//SC.nextInt();
	int sqr=num*num;
	int sum=0;
	for(int i=sqr;i>0;i/=10){
		 sum+=i%10;
	}
	 
	if(sum==num){
		System.out.println("Neon Num");
	}
		else{
			System.out.println(" Not an Neon Num");
		}
	
}
}