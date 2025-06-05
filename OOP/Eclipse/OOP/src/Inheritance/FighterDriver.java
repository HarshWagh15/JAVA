package Inheritance;

public class FighterDriver {
 public static void main(String[] args) {
	MultiSu30 m1= new MultiSu30("Sukhoi",2,2,500000000,3000,"Air to Air",2000,"Brahmos","Yes","Yes");
	
	m1.displaySu30(); // All data
	
	m1.displayFighter(); //only Fighter data
	
	m1.displayAircraft(); // only Aircraft data
}
}
