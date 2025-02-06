import java.util.*;
class PrintCharOfName{
	public static void main(String[] args)
	throws InterruptedException
	 {
		Scanner SC= new Scanner(System.in);
		System.out.print("Enter Name:");
		String Name=SC.next().toUpperCase();
		int Length=Name.length();
		for(int i=0;i<Length;i++){
			System.out.print(Name.charAt(i));
			Thread.sleep(1000);
		}
	}
}