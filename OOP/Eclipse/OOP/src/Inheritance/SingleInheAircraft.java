package Inheritance;

public class SingleInheAircraft {
	String Type;
	long Range;
	int SeatCap;
	
	
	SingleInheAircraft(){
		
	};
	
	SingleInheAircraft(String Type, long Range, int SeatCap){
		this.Type=Type;
		this.Range=Range;
		this.SeatCap=SeatCap;
	};
	
	public void displayAircraft() {
		System.out.println(Type);
		System.out.println(Range);
		System.out.println(SeatCap);
	}
}
