package principlesOfOOP;

public class PenDriver {
	public static void main(String[] args) {
		EarlyPen p1=new EarlyPen("Cello",10.0,"Gel","Red",1,"Gel");
		
		p1.displayPen();
		p1.rf.displayRefill();
		
	}

}
