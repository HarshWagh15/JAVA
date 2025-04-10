package principlesOfOOP;

public class EarlyPen {
	String brand;
	double price;
	String type;
	EarlyRefill rf;
	
	public EarlyPen() {
		// Auto Generate Constructor
	}
	
	EarlyPen(String brand,double price, String type, String color,int size,String refillType){
		
		rf=new EarlyRefill(color,size,refillType); 
		
		this.brand=brand;
		this.price=price;
		this.type=type;
		
	}
	
	public void displayPen() {
		System.out.println(brand);
		System.out.println(price);
		System.out.println(type);
	}
	
}
