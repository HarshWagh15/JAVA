import java.util.*;
class Season{
	public static void main(String[] args) {
		System.out.print("Enter the Month:");
		String Month=new Scanner(System.in).next();
		String Seasons=((Month.equals("Jan"))||(Month.equals("Dec"))||(Month.equals("Oct"))||(Month.equals("Nove"))?
		("Season is Winter"):
		((Month.equals("Feb"))||(Month.equals("Mar"))||(Month.equals("Apr"))||(Month.equals("May"))?
		("Season is Summer"):("Season is Monsoon ")));

		System.out.println(Seasons);
	}
}
