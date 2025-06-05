package Inheritance;

public class MultiAircraft {
String Brand;
int NoEngine;
int Seat;
long price;

public MultiAircraft() {
	// TODO Auto-generated constructor stub
};

public MultiAircraft(String Brand,int NoEngine,int Seat,long price) {
	this.Brand=Brand;
	this.NoEngine=NoEngine;
	this.Seat=Seat;
	this.price=price;
	
};

public void displayAircraft() {
	System.out.println(Brand);
	System.out.println(NoEngine);
	System.out.println(Seat);
	System.out.println(price);
};
};
