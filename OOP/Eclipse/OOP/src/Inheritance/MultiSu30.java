package Inheritance;

public class MultiSu30 extends MultiFighterAircraft{
String Weapons;
String ThrustVectoring;
String Avionics;

public MultiSu30() {
	// TODO Auto-generated constructor stub
}

public MultiSu30(String Brand,int NoEngine,int Seat,long price,long Range,String Refulling,int Speed,String Weapons,String Avionics,String ThrustVectoring) {
	this.Brand=Brand;
	this.NoEngine=NoEngine;
	this.Seat=Seat;
	this.price=price;
	
	this.Range=Range;
	this.Refulling=Refulling;
	this.Speed=Speed;
	
	this.Weapons=Weapons;
	this.Avionics=Avionics;
	this.ThrustVectoring=ThrustVectoring;
	
};

public void displaySu30() {
	displayFighter();
	
	System.out.println(Weapons);
	System.out.println(ThrustVectoring);
	System.out.println(Avionics);
}

}
