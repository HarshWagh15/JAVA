import java.util.*; 
class PassFail{
	public static void main(String[] args) {
		
		System.out.print("Enter Your Marks:");
		float Marks=new Scanner(System.in).nextFloat();
		float Per=(Marks*100)/600;
		// String Result=(Per>=35)?("Pass"):("Fail");
		String Result=(Per>=75)?("Passed with Grade A"):
		(Per>=60)?("Passed with Grade B"):
		(Per>=35)?("Passed with Grade C"):
		"Failed";
		System.out.println(Result);
	}
}