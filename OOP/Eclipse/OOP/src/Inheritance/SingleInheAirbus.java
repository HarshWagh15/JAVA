package Inheritance;

public class SingleInheAirbus extends SingleInheAircraft{
String EngineMnf;
String CoO;

SingleInheAirbus(){
	
};

SingleInheAirbus(String Type, long Range, int SeatCap, String EngineMnf, String CoO){
	this.Type=Type;
	this.Range=Range;
	this.SeatCap=SeatCap;
	
	this.EngineMnf=EngineMnf;
	this.CoO=CoO;
}

public void displayAirbus() {
	displayAircraft();
	
	System.out.println(EngineMnf);
	System.out.println(CoO);
}

}
