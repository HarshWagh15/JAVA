import java.util.*;
class PalindromeString{
	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		System.out.print("Enter the String:");
		String str=SC.next().toUpperCase();
		String rev="";
		String dup=str;
		for(int i=0;i<str.length();i++){
			rev=str.charAt(i)+rev;
			
		}
		if(rev.equals(dup)){
			System.out.println("The string is valid Palindrome !");
		}
		else{System.out.println("The string is not valid Palindrome !");
	}

	}
}