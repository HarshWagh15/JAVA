import java.util.*;
class Char{
	public static void main(String[] args) {
		System.out.print("Enter the input:");
		char input=new Scanner(System.in).next().charAt(0);
		System.out.println((input>=65&&input<='Z')?(input+" It is an Uppercase letter."):(input+" Not an Uppercase Letter"));
	}
}