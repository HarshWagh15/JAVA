package Inheritance;

public class MultiFighterAircraft extends MultiAircraft{
long Range;
String Refulling;
int Speed;

public MultiFighterAircraft() {
	// TODO Auto-generated constructor stub
};

public MultiFighterAircraft(String Brand,int NoEngine,int Seat,long price,long Range,String Refulling,int Speed) {
	this.Brand=Brand;
	this.NoEngine=NoEngine;
	this.Seat=Seat;
	this.price=price;
	
	this.Range=Range;
	this.Refulling=Refulling;
	this.Speed=Speed;
	
};

public void displayFighter() {
	displayAircraft();
	
	System.out.println(Range);
	System.out.println(Refulling);
	System.out.println(Speed);
}
}
