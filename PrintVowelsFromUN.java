import java.util.*;
class PrintVowelsFromUN{
	public static void main(String[] args)
	 {
		Scanner SC= new Scanner(System.in);
		System.out.print("Enter Name:");
		String Name=SC.next().toUpperCase();
		int Length=Name.length();
		for(int i=0;i<Length;i++){
			char ch=Name.charAt(i);
			if(charAt(ch)==("A") || 
                charAt(ch)==("E") || 
                charAt(ch)==("I") || 
                charAt(ch)==("O") || 
                charAt(ch)==("U")){

				System.out.print((i)+" ");	
			}
		
		}
	}
}