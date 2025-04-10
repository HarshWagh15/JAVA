package principlesOfOOP;

public class MobileDriver {
	public static void main(String[] args) {
		LateMobile m1=new LateMobile("Nokia","800","4g",1800);
		m1.displayMobile();
		
		 m1.insertSim("jio", "5G", "prepaid", 947895612);
		 m1.ls.displaySim();
	}
}
