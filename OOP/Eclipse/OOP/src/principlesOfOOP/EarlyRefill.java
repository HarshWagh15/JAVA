package principlesOfOOP;

public class EarlyRefill {
	String color;
	int size;
	String refillType;
	
	public EarlyRefill() {
		// Auto Generate Constructor
	}
	
	EarlyRefill(String color,int size,String refillType){
		this.color=color;
		this.size=size;
		this.refillType=refillType;
	}
	
	public void displayRefill() {
		System.out.println(color);
		System.out.println(size);
		System.out.println(refillType);
	}
}

	
