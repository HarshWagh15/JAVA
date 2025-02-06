import java.util.*;
class VowelConsonent{
	public static void main(String[] args) {
		System.out.print("Enter the char:");
		char input=new Scanner(System.in).next().charAt(0);
		String vowel=((input=='a')||(input=='e')||(input=='i')||(input=='o')||(input=='u'))?(input+" is an vowel."):(input+" is an consonent");
		System.out.println(vowel);
	}
}