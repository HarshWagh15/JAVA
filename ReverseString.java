import java.util.*;
class ReverseString{
	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		System.out.print("Enter the String:");
		String str=SC.next();
		String rev="";
		for(int i=0;i<str.length();i++){
			rev=str.charAt(i)+rev;
			
		}
		System.out.println(rev);

	}
}