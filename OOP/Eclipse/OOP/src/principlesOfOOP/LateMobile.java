package principlesOfOOP;

public class LateMobile {
String brand;
String name;
String type;
double price;
LateSim ls;


public LateMobile() {
	// Auto Generate Constructor
}

	LateMobile(String brand,String name,String type,double price){
		this.brand=brand;
		this.name=name;
		this.type=type;
		this.price=price;
		System.out.println("Mobile Created !");
	}
	
	public void insertSim(String networkProvider,String networkType, String type, long simNo) {
		ls=new LateSim(networkProvider,networkType,type,simNo); //Helper Method
		
		System.out.println("Sim Inserted Succesfully !");
		
	}
	
	public void displayMobile() {
		System.out.println(brand);
		System.out.println(name);
		System.out.println(type);
		System.out.println(price);
	}

}
