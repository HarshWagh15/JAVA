import java.util.*;
class IdentifyCharDigit{
	public static void main(String[] args) {
		System.out.print("Enter the input:");
		char input=new Scanner(System.in).next().charAt(0);
		String Ch=((input>='A'&&input<='Z')||(input>='a'&& input<=122))?((input>='a'&&input<='z')?(input+" is an LowerCase Alphabet"):(input+ " is an UpperCase Alphabet")):((input>=0&&input<=9)?(input + " is an Digit"):(input + " is not an Digit"));
		System.out.println(Ch);
	}
}